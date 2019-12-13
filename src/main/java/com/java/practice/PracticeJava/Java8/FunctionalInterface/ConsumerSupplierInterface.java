package com.java.practice.PracticeJava.Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerSupplierInterface {

    public static void main(String[] args) {

        Person person = new Person("Rajneesh",20);
        Person person1 = new Person("kabeer",20);

        List<Person> people=new ArrayList<>();
        people.add(person);
        people.add(person1);

        //ForEach method taking input as a consumer
        //Consumer and supplier both example
        people.stream().forEach((item) ->{
            printNames(() -> item);
            // System.out.println(item.get());
        });


       /* Supplier<Person> personSupplier = () -> new Person("Rajneesh",20);
        Supplier<Person> personSupplier1 = () -> new Person("Tarun",30);
        System.out.println(personSupplier.get());
        System.out.println(personSupplier1.get());*/

    }

    private static void printNames(Supplier<Person> supplier) {
        System.out.println(supplier.get());
    }
}

class Person /*implements Supplier<Person>*/{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public Person get() {
        return this;
    }*/
}


// It's conditional based functional interface
class Java8Predicates {

    public static void main(String[] args) {
        Person person = new Person("Kabeer",20);
        Person person1 = new Person("Rajneesh",40);

        List<Person> people=new ArrayList<>();
        people.add(person);
        people.add(person1);

        //p.getName().equals("Rajneesh") ==== return true/false
        Predicate<Person> israjneesh = p -> p.getName().equals("Rajneesh");

        //p.getAge() < 30 ==== return true/false
        Predicate<Person> isAge = (p) -> p.getAge() < 30;


        people.stream().filter(age->age.getAge()<30).forEach(System.out::println);

       /* System.out.println("Young Person :: ");
        showPersons(people,isAge);

        System.out.println("Person with name condition :: ");
        showPersons(people,israjneesh);*/

    }

    public static void showPersons(List<Person> list, Predicate<Person> condition) {
        for (Person p : list)
            if (condition.test(p)) System.out.println(p.toString());
    }

}

