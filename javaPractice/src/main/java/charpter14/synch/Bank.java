package charpter14.synch;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;

    public Bank(int counts, double initialBalance) {

        accounts = new double[counts];
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount){
        bankLock.lock();
        try {
            while (accounts[from] < amount) {
                sufficientFunds.await();
            }
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
            sufficientFunds.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bankLock.unlock();
        }

    }

    private double getTotalBalance() {
        bankLock.lock();
        try {
            double sum = 0;
            for (double a : accounts){
                sum += a;
            }

            return sum;
        }finally {
            bankLock.unlock();
        }
    }

    public int size(){
        return  accounts.length;
    }
}
