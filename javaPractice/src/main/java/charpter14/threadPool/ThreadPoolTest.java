package charpter14.threadPool;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.*;

public class ThreadPoolTest {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            String directory = in.nextLine();
            String kyeword = in.nextLine();

            ExecutorService executorService = Executors.newCachedThreadPool();

            MatchCounter counter = new MatchCounter(new File(directory), kyeword, executorService);

            Future<Integer> result = executorService.submit(counter);
            try {
                result.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            executorService.shutdown();

            int largestPoolSize = ((ThreadPoolExecutor) executorService).getLargestPoolSize();
            System.out.println("lagest size"+ largestPoolSize);
        }
    }
}
