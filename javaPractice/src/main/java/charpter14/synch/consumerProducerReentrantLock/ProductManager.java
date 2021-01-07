package charpter14.synch.consumerProducerReentrantLock;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProductManager {

    private final LinkedList<Product> productList;
    private long counts;
    private ReentrantLock lock;
    private Condition listNotEmpty;
    private Condition listNotFull;


    public ProductManager(long counts) {
        this.counts = counts;
        this.productList = new LinkedList<>();
        lock = new ReentrantLock();
        listNotEmpty = lock.newCondition();
        listNotFull = lock.newCondition();

    }

    public void Add(Product product) {
        lock.lock();
        try {
            while (productList.size() == counts) {
                listNotEmpty.await();
            }
            boolean isAdded = productList.offer(product);
            if (isAdded) {
                System.out.println("add a new product" + product.getName());

                listNotFull.signalAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public Product take() {
        lock.lock();
        try {
            while (productList.size() == 0) {
                listNotFull.await();
            }
            Product product = productList.poll();

            if (product != null) {
                System.out.println("get a product" + product.getName());
                listNotEmpty.signalAll();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {

            lock.unlock();
        }
        return null;
    }
}

