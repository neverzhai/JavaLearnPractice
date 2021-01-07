package charpter14.AQS;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {
    private static int  threadCount = 100;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(20);

        CountDownLatch countDownLatch = new CountDownLatch(threadCount);

        for(int i = 0; i< threadCount; i++){
            final  int threadNum = 1;
            threadPool.execute(() -> {
                try {
                    doSomething(threadNum);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    countDownLatch.countDown();
                }
            });
        }

        countDownLatch.await();
        threadPool.shutdown();
        System.out.println("finish");
    }

    private static void doSomething(int threadNum) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("ThreadNum: " + threadNum);
        Thread.sleep(1000);

    }
}
