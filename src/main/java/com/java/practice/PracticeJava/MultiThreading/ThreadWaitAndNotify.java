package com.java.practice.PracticeJava.MultiThreading;

import java.io.Serializable;

public class ThreadWaitAndNotify extends Thread implements Serializable{

    private String packet;

    // True if receiver should wait
    // False if sender should wait
    private boolean transfer = true;


    public static void main(String[] args) {
        ThreadWaitAndNotify threadWaitAndNotify=new ThreadWaitAndNotify();
        threadWaitAndNotify.start();
       /* ThreadWaitAndNotify threadWaitAndNotify1=new ThreadWaitAndNotify();
        threadWaitAndNotify1.start();*/
    }

    @Override
    public void run() {
        super.run();
        System.out.println("Inside the run method : ");
    }


    public void Send(){

    }

    public void Receive(){

    }

}
