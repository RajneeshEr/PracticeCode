package com.java.practice.PracticeJava.Java8.FunctionalInterface;

public class Java8InterfaceBasic implements Interface1, Interface2 {

    // Runnable interface
    public static void main(String[] args) {

        Interface1 javaFunctional= new Java8InterfaceBasic();
        System.out.println(javaFunctional.sum(10,90));
        System.out.println(javaFunctional.sumDefault(20,80));
    }


    @Override
    public int sum(int a, int b) {
        System.out.println("Inside class method: ");
        return a+a+b;
    }

    @Override
    public int sumDefault(int a, int b) {
        System.out.println("Inside class default method: ");
        Interface1.super.sumDefault(10,20);
        return a-b;
    }

    //Method Hiding concept
    static void staticSum(int a, int b){
        System.out.println("Static method inside interface2 :: ");
    }
}


//Functional interface must have only one abstract method

@FunctionalInterface
interface Interface1{
    int sum(int a, int b);

    default int sumDefault(int a, int b){
        System.out.println("Inside interface default method: ");
        return a+b;
    }
}

@FunctionalInterface
interface Interface2{
    int sum(int a, int b);

    default int sumDefault(int a, int b){
        System.out.println("Inside interface default method: ");
        return a+b;
    }

    static void staticSum(int a, int b){
        System.out.println("Static method inside interface2 :: ");
    }
}
