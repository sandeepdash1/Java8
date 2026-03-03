package com.practise;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        Function<Integer ,Integer> doubleIt = x -> 2 * x;
        Function<Integer,Integer> tripleIt = x -> 3 * x;
        
        System.out.println(doubleIt.apply(20));   // abstract method
        
        System.out.println(doubleIt.andThen(tripleIt).apply(20));  // default Method
        System.out.println(doubleIt.compose(tripleIt).apply(20));  // default Method

        Function<Integer, Integer> identity = Function.identity();  // static method
        System.out.println(identity.apply(5));
    }
}
