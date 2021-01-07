package charpter14.synch.consumerProducerSynchronized;

public class ConsumerProducerTest {

    public static void main(String[] args) {
        ProductManager productManager = new ProductManager(10);

        for (int i= 0 ; i< 100; i++) {
            Consumer consumer = new Consumer(productManager);
            Producer producer = new Producer(productManager);

            Thread consumerThread = new Thread(consumer.runnable);
            Thread producerThread = new Thread(producer.runnable);

            consumerThread.start();
            producerThread.start();
        }
    }
}
