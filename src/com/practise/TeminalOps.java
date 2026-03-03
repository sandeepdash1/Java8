package com.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TeminalOps {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        //list.stream().skip(1).toList(); --> In version of java after 1.8

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));
        list.stream().forEach(System.out::println); // using method reference

        // 3. reduce : combine elements to produce a single result
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y); // normal -> function
        Optional<Integer> reduce1 = list.stream().reduce(Integer::sum);  // using method reference
        System.out.println(reduce.get());
        System.out.println(reduce1.get());

        // 4. count
        long count = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println(count);

        // 5. anyMatch , allMatch , nonMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6. findFirst , findAny
        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().findAny().get());

        // Examples : Filtering and collecting
        List<String> stringList = Arrays.asList("Sandeep" , "Ankit" , "Ram");
        System.out.println(stringList.stream().filter(x -> x.length() > 3).collect(Collectors.toList()));

        // Example : Squaring and Sorting
        List<Integer> integerList = Arrays.asList(5, 2, 9, 1, 6);
        System.out.println(integerList.stream().map(x -> x * x).sorted().collect(Collectors.toList()));

        // Example : Summing values
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(num.stream().reduce(Integer::sum).get());

        // Example : Counting Occurrence of charaters
        String s = "Hello World";
        System.out.println(s.chars().filter(x -> x == 'l' ).count());



    }
}
