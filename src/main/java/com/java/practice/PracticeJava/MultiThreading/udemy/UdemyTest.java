package com.java.practice.PracticeJava.MultiThreading.udemy;



/*
* thread.start(); ==> this method will instruct to JVM to create new Thread and pass
* it to operating system,
* */
public class UdemyTest {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("We are now in Thread " + Thread.currentThread().getName());
            System.out.println("Current Thread Priority "+ Thread.currentThread().getPriority());
        });

        System.out.println("Current Thread before starting new Thread "+ Thread.currentThread().getName());

        /*Set the Name of thread, it would be easy to understand by name once we have more than 1 thread
        * in the application */
        thread.setName("New Worker Thread");

        thread.setPriority(Thread.MAX_PRIORITY);

        thread.start();

        System.out.println("print name of thread after starting new Thread "+ Thread.currentThread().getName());
    }
}


class TestThread extends Thread {
    @Override
    public void run() {
        System.out.println("we are now in "+ this.getName());

        // this.getName();===>  @Here this is thread instance, we can access any thread class method
    }


}