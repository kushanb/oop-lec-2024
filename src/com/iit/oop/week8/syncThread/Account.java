package com.iit.oop.week8.syncThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String name;
    private double balance;
    private Lock balanceLock;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.balanceLock = new ReentrantLock();
    }

    /**
     * Increase the balance by depositing an amount
     *
     * @param amount
     */
    public synchronized void deposit(double amount) {
        if(amount < 0) {
            System.out.println("For thread " +
                    Thread.currentThread() + "Not a valid amount...");
        } else {
            balanceLock.lock();
            this.balance += amount;
            System.out.println("For thread " +
                    Thread.currentThread() + "Balance after deposit is: " + this.balance);
            balanceLock.unlock();
        }
    }

    /**
     * Decrease the balance by withdrawing an amount
     *
     * @param amount
     */
    public synchronized void withdraw(double amount) {
        if(amount > this.balance) {
            System.out.println("For thread " +
                    Thread.currentThread() + "Insufficient Balance...");
        } else {
            balanceLock.lock();
            this.balance -= amount;
            System.out.println("For thread " +
                    Thread.currentThread() + "New balance after withdrawal is: " + this.balance);
            balanceLock.unlock();
        }
    }
}
