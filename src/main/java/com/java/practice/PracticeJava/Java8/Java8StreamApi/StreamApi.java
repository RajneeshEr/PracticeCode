package com.java.practice.PracticeJava.Java8.Java8StreamApi;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

/*
* lazy load
* Mostly every intermediate operation expects a Predicate function which can perform the action.
* -----------------------------------------------------------------------------------------------
* Filter    ---- Predicate with input and return boolean value
* Map       ---- Function take input and return / Supplier don't take input and return
* ForEach   ---- Consumer takes input and no return
* */
public class StreamApi {

    public static void main(String[] args) {

        Collection collection=new ArrayList();

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(44);

        //Predicate<Integer> doubleTheNumber = number -> number * 2;

        Predicate<Integer> integerPredicate = integer -> integer%5==0;
        Function<Integer, Integer> multiplyTheNumber = times -> times*2;
        ToIntFunction<Integer> toIntFunction = o -> o*3;

        List<Integer> intList = list.stream()
                .filter(integerPredicate)
                .mapToInt(toIntFunction)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(intList);

    }


}
