package com.java.practice.PracticeJava.Java8.Java8StreamApi;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/* Stream filter(Predicate predicate) returns a stream consisting of the elements of this stream
* that match the given predicate. This is an intermediate operation.
* These operations are always lazy
*
*   Stream<T> filter(Predicate<? super T> predicate)
    Where, Stream is an interface and T is the
    type of the input to the predicate.
    The function returns the new stream.
*
*/
public class Filter {
    public static void main(String[] args) {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        Function<Integer, String> integerStringFunction = integer -> {
            return integer.toString();
        };



        // Using Stream filter(Predicate predicate)
        // to get a stream consisting of the
        // elements that are divisible by 5
        List<Integer> list1= list.stream()
                .filter(num -> num % 5 == 0)
                .map(integer -> {
                    return integer*3;
                }).collect(Collectors.toList());/*.forEach(System.out::println);*/

        System.out.println(list);
    }
}
