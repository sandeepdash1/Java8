package com.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {

        // Intermediate Operation transfer a stream to another stream
        // They are lazy they don't execute until a terminal operation is invoked

        // 1. filter
        List<String> list = Arrays.asList("Ankit","Sandeep","Ram","Ankit");
        Stream<String> a1 = list.stream().filter(x -> x.startsWith("A"));
        System.out.println(a1); // no filtering at this point
        long count = a1.count(); // terminal operation is used here.
        System.out.println(count);

        // 2. map
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        Stream<String> methodRef = list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        // 5. limit
        System.out.println(Stream.iterate(1 , x -> x + 1).limit(10).count());

        // 6. Skip
        System.out.println(Stream.iterate(1 , x -> x + 1).skip(2).limit(10  ).count());

    }
}
