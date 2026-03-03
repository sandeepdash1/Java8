package com.java17Feature;

public class SwitchStatementWithReturnValue {

    public static String formatter(Object obj){
        return switch (obj){
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case null -> "Unknown Object";
            default -> throw new IllegalStateException("Unexpected value: " + obj);
        };
    }

    public static void main(String[] args) {
       String formattedValue =  formatter(1);
       System.out.println(formattedValue);

        String formattedValue1 =  formatter("Sandeep");
        System.out.println(formattedValue1);

        String formattedValueNull =  formatter(null);
        System.out.println(formattedValueNull);

    }
}
