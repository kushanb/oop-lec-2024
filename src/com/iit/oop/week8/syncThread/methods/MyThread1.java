package com.iit.oop.week8.syncThread.methods;
 public class MyThread1 implements Runnable {

        boolean stopped;
        boolean suspended;

        //constructor
        public MyThread1() {
            suspended = false;
            stopped = false;
        }

        // the entry point for the thread
        public void run() {
            System.out.println("My thread starting.");
            try {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                    Thread.sleep(500);

                    // Use syncronized block to check suspended and stopped
                    synchronized (this) {
                        while (suspended)
                            wait();
                    }
                    if (stopped)
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println("My thread is interrupted");
            }
            System.out.println("My thread exiting.");
        }

        //stop the thread
        synchronized void myStop() {
            stopped = true;
            // the following ensure that a thread that was suspended is stopped
            suspended = false;
            notify();
        }

        //suspended the thread
        synchronized void mySuspend() {
            suspended = true;
        }

        // resume
        synchronized void myResume() {
            suspended = false;
            notify();
        }

     public static void main(String[] args) {
         MyThread1 mythread = new MyThread1();

         Thread t = new Thread(mythread);
         t.start();

         try{
             Thread.sleep(1000); // t is running

             mythread.mySuspend(); // suspend the thread
             System.out.println("Suspending thread");
             Thread.sleep(1000);

             mythread.myResume(); // resume the thread
             System.out.println("Resuming thread");
             Thread.sleep(1000);

             mythread.mySuspend(); // suspend again the thread
             System.out.println("Suspending thread");
             Thread.sleep(1000);

             mythread.myResume(); // resume the thread
             System.out.println("Resuming thread");
             Thread.sleep(1000);

             //stopping thread
             mythread.myStop();
         }
         catch(InterruptedException e){
             System.out.println("Main thread interrupted");
         }

         System.out.println("Main thread exiting");
     }

 }
