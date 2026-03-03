package com.record;

public record RecordDemo(String name, int age) {

    //Defining static field in record class
    public static final String DEFAULT_PERSON_NAME = "Sandeep";

    //Overriding the record class constructor
    public RecordDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Defining instance method in the record class
    public String convertNameToUpperCase(String name) {
        return name.toUpperCase();
    }

    //Defining static method in the record class
    public static void displayDetails() {
        System.out.println("Default Name of the person is: " + DEFAULT_PERSON_NAME);
    }
}


