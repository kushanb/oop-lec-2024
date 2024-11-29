package com.iit.oop.week8.multipleThreads;

public class ThreadB extends Thread{
    @Override
    public void run() {
        System.out.println("Starting thread B");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\tFrom Thread B: ---> " + i);
        }
        System.out.println("End of Thread B");
    }
}
