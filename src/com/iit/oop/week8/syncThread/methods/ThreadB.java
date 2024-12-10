package com.iit.oop.week8.syncThread.methods;

public class ThreadB extends Thread {
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
        }
    }

}
