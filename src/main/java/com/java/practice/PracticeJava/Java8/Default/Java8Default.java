package com.java.practice.PracticeJava.Java8.Default;

public class Java8Default implements Foo{

    //No implementation required as it is already provided in the interface
    public static void main(String[] args) {
        Foo foo = new Java8Default();
        foo.sumDefault(2,4);

    }

    @Override
    public int sumDefault(int a, int b) {
        return a+b+b;
    }
}


interface Foo {

    //Default method declaration
    default int sumDefault(int a, int b) {
        return a + b; //simply adds a + b
    }

    //Static method declaration
    static int sumStatic(int a, int b) {
        return a + b; //simply adds a + b
    }
}