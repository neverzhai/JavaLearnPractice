package charpter14.future;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTest {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            String directory = in.nextLine();
            String kyeword = in.nextLine();

            MatchCounter counter = new MatchCounter(new File(directory), kyeword);

            FutureTask<Integer> task = new FutureTask<>(counter);

            Thread t = new Thread(task);
            t.start();
            try {
                task.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
