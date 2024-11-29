package com.iit.oop.week8.multipleThreads;

public class ThreadC extends Thread {
    @Override
    public void run() {
        System.out.println("Starting thread C");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\t\tFrom Thread C: ---> " + i);
        }
        System.out.println("End of Thread C");
    }
}
