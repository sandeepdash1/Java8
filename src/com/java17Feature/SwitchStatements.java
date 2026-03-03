package com.java17Feature;

public class SwitchStatements {
    public static void beforeJava17Feature(int num){
        String result;
        switch (num){
            case 1:
                result = "one";
                break;
            case  2:
                result = "two";
                break;
            default:
                result = "unknown";
                break;
        }
        System.out.println("WithOut Java 17 = "+result);
    }
    public static void inJava17(int numm){
        String out = switch(numm){
            case 1 -> "one";
            case 2 -> "two";
            default -> throw new IllegalStateException("Unexpected value: " + numm);
        };
        System.out.println("Using Java 17 = "+out);
    }
    /* MULTIPLE VALUE PER CASE */
    public static void multipleValueCaseInJava17(int numm){
        String out = switch(numm){
            case 1 -> "ONE";
            case 2,3,4 -> "TWO, THREE, FOUR";
            default -> throw new IllegalStateException("Unexpected value: " + numm);
        };
        System.out.println("Using Java 17 = "+out);
    }

    public static void main(String[] args) {
        beforeJava17Feature(2);
        inJava17(1);
        multipleValueCaseInJava17(2);
    }
}
