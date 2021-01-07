package charpter14.synch.consumerProducerSynchronized;

import java.util.Random;

public class Producer {

    private ProductManager productManager;
    private Random random = new Random();

    public Producer(ProductManager productManager) {
        this.productManager = productManager;
    }

    Runnable runnable = () -> {
        int randomNumber = random.nextInt();
        Product product = new Product(String.valueOf(randomNumber));
        productManager.Add(product);
    };
}
