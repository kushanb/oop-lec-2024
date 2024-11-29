package com.iit.oop.week8;

import com.iit.oop.week8.extendThread.MyThread;
import com.iit.oop.week8.implRunnable.MyRunnableThread;
import com.iit.oop.week8.multipleThreads.ThreadA;
import com.iit.oop.week8.multipleThreads.ThreadB;
import com.iit.oop.week8.multipleThreads.ThreadC;
import com.iit.oop.week8.stoppingThreads.ThreadToStop;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
//        thread1.start();

//        MyRunnableThread myThread1 = new MyRunnableThread();
        Thread thread2 = new Thread(new MyRunnableThread());
//        thread2.start();

        Thread threadA = new ThreadA();
        Thread threadB = new ThreadB();
        Thread threadC = new ThreadC();
//        threadA.setPriority(Thread.MAX_PRIORITY);

//        threadA.start();
//        threadB.start();
//        threadC.start();


        ThreadToStop stoppableThread = new ThreadToStop();
        stoppableThread.start();
//
        Thread.sleep(1000);
        stoppableThread.stopThread();
//        stoppableThread.interrupt();

    }
}
