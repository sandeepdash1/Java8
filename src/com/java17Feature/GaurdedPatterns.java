package com.java17Feature;

public class GaurdedPatterns {

    public static void gaurdedPatternDemo(Object obj){
         switch (obj){
            case String s when s.length() > 5 -> System.out.println("Output: " + s);
            case Integer i when i % 2 == 0 -> System.out.println("Output: " + i);
            default -> System.out.println("Nothing");
        };
    }

    public static void main(String[] args) {
        gaurdedPatternDemo("Sandeep");
        gaurdedPatternDemo(4);
        gaurdedPatternDemo(5);

    }
}
