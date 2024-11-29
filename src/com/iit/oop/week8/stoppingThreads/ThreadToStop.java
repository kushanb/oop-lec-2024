package com.iit.oop.week8.stoppingThreads;

public class ThreadToStop extends Thread {
    private boolean exit = false;

    @Override
    public void run() {
        int count = 0;
        while (!exit) {
            System.out.println("Thread is running..." + count++);
        }
    }

    public void stopThread() {
        this.exit = true;
    }
}
