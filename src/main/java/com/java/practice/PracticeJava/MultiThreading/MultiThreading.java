package com.java.practice.PracticeJava.MultiThreading;


/*In Multi-Threading join method ?
*
*
* */
public class MultiThreading extends Thread {

    public static void main(String[] args) {
       MultiThreading multiThreading=new MultiThreading();

       multiThreading.start();
    }

    /*super.start(); don't call inside run method because it's not holding thread instance*/
    @Override
    public void run() {
        super.run();
        //super.start();
        System.out.println("In run method");
    }


    /*If you override start method then you need to start the thread by calling
        super.start(); method if you don't call then run method will not be calling*/
    @Override
    public void start() {
        super.start();
        System.out.println("In start method");
    }

}
