package com.iit.oop.week8.multipleThreads;

public class ThreadA extends Thread {

    @Override
    public void run() {
        System.out.println("Starting thread A");
        for (int i = 1; i <= 5; i++) {
            System.out.println("From Thread A: ---> " + i);
        }
        System.out.println("End of Thread A");
    }
}
