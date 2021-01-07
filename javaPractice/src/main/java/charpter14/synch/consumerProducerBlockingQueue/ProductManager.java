package charpter14.synch.consumerProducerBlockingQueue;

import java.util.concurrent.LinkedBlockingQueue;

public class ProductManager {

    private final LinkedBlockingQueue<Product> productList;
    private long counts;


    public ProductManager(long counts) {
        this.counts = counts;
        this.productList = new LinkedBlockingQueue<>();

    }

    public void Add(Product product) {
        boolean isAdded = productList.offer(product);
        if (isAdded) {
            System.out.println("add a new product" + product.getName());
        }

    }

    public Product take() {
        Product product = productList.poll();
        if (product != null) {
            System.out.println("get a product" + product.getName());
        }
        return product;

    }
}

