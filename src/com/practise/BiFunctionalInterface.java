package com.practise;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterface {
    public static void main(String[] args) {
        /*BiPredicate where we can give two inputs*/
        BiPredicate<Integer,Integer> isEven = (x , y) -> (x + y) % 2 == 0;
        System.out.println(isEven.test(5,5));

        /*BiConsumer wehre we cwn give 2 inputs */
        BiConsumer<Integer ,Integer> biConsumer = (x ,y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        /*BiFunction which takes 2 inputs and return a result */
        BiFunction<String , String , Integer> biFunction = (x ,y) -> (x + y).length();
        System.out.println(biFunction.apply("a" , "bc"));

    }
}
