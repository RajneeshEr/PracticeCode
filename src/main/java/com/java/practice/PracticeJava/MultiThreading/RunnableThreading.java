package com.java.practice.PracticeJava.MultiThreading;



/*Synchronization:
To prevent the race condition, we use synchronization in Java.
It prevents a block of code to be executed by a single thread at a same time.
So using the below code we can prevent race condition as:

 --lock over static method
public static synchronized methodName() {
        // Method body
}

--lock over non-static method
public synchronized methodName() {
        // Method body
}

The third possibility is to use a dedicated object as a lock object as:
private final Object key = new Object();
private methodName() {
    synchronized(key){
        // Method body
   }
}
*/



public class RunnableThreading implements Runnable {

    private String name;
    private Thread thread;

    public RunnableThreading(String name) {
        this.name = name;
        this.thread = new Thread(this,name);
        this.thread.start();
    }

    public static void main(String[] args) {
            String name="Thread1";
            Runnable runnable=new RunnableThreading(name);
    }

    @Override
    public void run() {
        System.out.println("inside run method "+name);
    }


}