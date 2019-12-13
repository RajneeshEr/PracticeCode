package com.java.practice.PracticeJava.Java8.FunctionalInterface;

import java.util.function.Function;

public class Java8FunctionInterface {


    //Static variable (shortName) of Function
    static Function<String, Integer> shortName = (s) -> {
        if (null == s || s.length() == 0) return 0;
        String[] splits = s.split(" ");
        String ret = splits[0];
        if (splits.length >= 2) ret += " " + splits[1].substring(0, 1) + ".";
        return ret.length();
    };

    public int[] printSum(int args[], int target){

        return args;
    }

    public static void main(String... args) {

        System.out.println(shortName.apply("Kazi Mahbubur Rahman"));
        System.out.println(shortName.apply("Adam Smith"));
    }
}
