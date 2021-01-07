package charpter14.synch.consumerProducerBlockingQueue;


public class Consumer {

    private ProductManager productManager;

    public Consumer(ProductManager productManager) {
        this.productManager = productManager;
    }

    Runnable runnable = () -> {
        Product product = productManager.take();
    };
}
