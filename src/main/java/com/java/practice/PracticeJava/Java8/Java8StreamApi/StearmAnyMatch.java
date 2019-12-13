package com.java.practice.PracticeJava.Java8.Java8StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StearmAnyMatch {
    public static void main(String[] args) {
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        //Predicate return boolean
        Predicate<Integer> integerPredicate =  n -> (n * (n + 1)) / 4 == 5;

        // Stream anyMatch(Predicate predicate)
        boolean answer = list.stream()
                .anyMatch(integerPredicate);

        // Displaying the result
        System.out.println(answer);


        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Geeks", "fOr",
                "GEEKSQUIZ", "GeeksforGeeks");

        // Check if Character at 1st index is
        // UpperCase in any string or not using
        // Stream anyMatch(Predicate predicate)
        boolean answer1 = stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));

        // Displaying the result
        System.out.println(answer1);

    }
}
