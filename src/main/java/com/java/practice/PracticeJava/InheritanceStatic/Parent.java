package com.java.practice.PracticeJava.InheritanceStatic;

public class Parent {

    static void display(){
        System.out.println("inside parent");
    }

}


class Child extends Parent{

    /*This will be allow */
    static void display(){
        System.out.println("inside child");
    }


    /*This will be not be allow*/
    //-----------------------------------
    /*  void display(){
        System.out.println("inside child");
    }*/

}


class Test{
    public static void main(String[] args) {
        Parent parent = new Child();

        /*Static Method will be call on Parent class*/
        Parent.display();

        /*Static Method will be call on Child class*/
        Child.display();
    }
}