package charpter14.synch.consumerProducerSynchronized;

import java.util.LinkedList;

public class ProductManager {

    private final LinkedList<Product> productList;
    private final long counts;


    public ProductManager(long counts) {
        this.counts = counts;
        this.productList = new LinkedList<>();
    }

    public synchronized void Add(Product product) {
        try {
            while (productList.size() == counts) {
                wait();
            }
            boolean isAdded = productList.offer(product);
            if(isAdded) {
                System.out.println("add a new product" + product.getName());
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized Product take() {
        try {
            while (productList.size() == 0){
                wait();
            }
            Product product = productList.poll();
            if(product != null) {
                System.out.println("get a new product" + product.getName());
                notifyAll();
                return product;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
