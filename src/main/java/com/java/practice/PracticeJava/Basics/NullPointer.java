package com.java.practice.PracticeJava.Basics;


public class NullPointer {

    public static void main(String[] args) {

        //Here pointer refernce is initialized with null
        NullPointer pointer=null;

        //nullpointer exception will occur on non static method
        pointer.test1();

        //No exception will occur
        pointer.test2();

    }

    static void test1(){
        System.out.println("inside static ");

    }

    void test2(){
        System.out.println("inside non static");
    }
}
