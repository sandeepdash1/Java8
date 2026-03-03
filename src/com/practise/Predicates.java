package com.practise;

import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        /* Predicate is a Functional Interface(Boolean valued Function)
        * It always returns true/false based on the condition
        * */
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4)); // abstract method

        Predicate<String> isCharStartsWith = x -> x.toLowerCase().startsWith("s");
        Predicate<String> isCharEndsWith = x -> x.toLowerCase().endsWith("p");

        Predicate<String> and = isCharStartsWith.and(isCharEndsWith);
        System.out.println(and.test("Sandeep"));

    }
}
