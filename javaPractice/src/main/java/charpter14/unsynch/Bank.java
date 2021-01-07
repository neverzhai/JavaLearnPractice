package charpter14.unsynch;

import java.util.Arrays;

public class Bank {
    private final double[] accounts;
    public Bank(int counts, double initialBanlance) {

        this.accounts = new double[counts];
        Arrays.fill(accounts, initialBanlance);
    }

    public void transfer(int from, int to, double amount){
        if(accounts[from] < amount) return;
        System.out.println(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf("%10.2f from %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
    }

    private double getTotalBalance() {
        double sum = 0;
        for (double a : accounts){
            sum += a;
        }
        return sum;
    }

    public int size(){
        return  accounts.length;
    }
}
