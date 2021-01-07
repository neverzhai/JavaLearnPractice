package charpter14.deadLock;

public class DeadLockDemo {
    public static void main(String[] argus) {
        Object resource1 = new Object();
        Object resource2 = new Object();

        new Thread( () -> {
            synchronized (resource1){
                System.out.println(Thread.currentThread()+ "get resource1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("waiting for resource2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread()+"get resource2");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (resource2){
                System.out.println(Thread.currentThread() + "get resource2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread()+ "waiting for resource1");
                synchronized(resource1){
                    System.out.println(Thread.currentThread()+ "get resource2");
                }
            }
        }).start();
    }
}
