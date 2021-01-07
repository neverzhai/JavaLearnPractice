package charpter14.AQS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static int threadCount = 500;

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(200);
        Semaphore semaphore = new Semaphore(20);

        for (int i = 0; i < threadCount; i++){
            final int threatNum = i;
            threadPool.execute(()-> {
                try {
                    semaphore.acquire(); // 获得一个许可，线程数= permits/获得许可数
                    test(threatNum);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
        System.out.println("finish");
    }

    public static void test(int threadnum) throws InterruptedException {
        Thread.sleep(1000);// 模拟请求的耗时操作
        System.out.println("threadnum:" + threadnum);
        Thread.sleep(1000);// 模拟请求的耗时操作
    }

}
