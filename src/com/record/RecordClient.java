package com.record;

public class RecordClient {
    public static void main(String[] args) {
        Person person = new Person("Sandeep", 34);
        System.out.println("Person: " + person);
        System.out.println("Person Details: " + person.getName() + person.getAge());

        RecordDemo demo = new RecordDemo("Sandeep", 34);
        System.out.println("Person: " + demo);
        System.out.println("Person Details: " + demo.name() + demo.age());
        demo.displayDetails();
    }
}
