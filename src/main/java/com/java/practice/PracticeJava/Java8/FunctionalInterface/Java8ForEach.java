package com.java.practice.PracticeJava.Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Java8ForEach {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++)list.add(i);

        Iterator it=list.iterator();

        while (it.hasNext()){
            Integer i = (Integer) it.next();
            System.out.println("Iterator Value::"+i);
        }

        //traversing through forEach method of Iterable with anonymous class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value::"+integer);
            }
        });

        //traversing through forEach method of Iterable with Lambda expression
        list.forEach(integer ->{
            System.out.println("forEach with lambda : "+integer);
        });

        ListConsumer listConsumer=new ListConsumer();
        list.forEach(listConsumer);

    }
}


class ListConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println("consumer implement value :: "+integer);
    }
}