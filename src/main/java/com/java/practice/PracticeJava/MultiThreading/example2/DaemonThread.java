package com.java.practice.PracticeJava.MultiThreading.example2;


import java.io.IOException;

public class DaemonThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new WaitingForUserInput());
        thread1.setName("InputWaitingThread");
        thread1.setDaemon(true);
        thread1.start();
        // --> thread1.setDaemon(true); run time exception illegalThreadState
        /* --> Daemon thread is to provide services to user thread for background supporting task*/

        Thread thread = new Thread(new SleepingThread());
        thread.start();
        thread.interrupt();
        System.out.println("Inside main : ");

    }
}

/*
* As a rule of thumb, never leave a catch block empty
* and use the InterruptedException catch block to gracefully stop the current thread
* (by adding some print or cleaning code before returning from the run method)
* */
class SleepingThread implements Runnable {
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted, Inside catch block");
                return;
            }
        }
    }
}


/*
* the only way to programmatically stop the application is to make the thread a daemon.
*Unfortunately System.in.read() does not respond to Thread.interrupt();
* */
class WaitingForUserInput implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                char input = (char) System.in.read();
                if(input == 'q') {
                    return;
                }
            }
        } catch (IOException e) {
            System.out.println("An exception was caught " + e);
        };
    }
}
