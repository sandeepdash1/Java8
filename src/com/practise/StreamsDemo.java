package com.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {

        /* What is Streams?
        A sequence of elements in a Functional and Declarative manner */

        /*How to use Streams
        * Source , Intermediate operation, Terminal Operation
        */

        // Creating Streams
        // 1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream();

        // 2. From Arrays
        String[] arr = {"a","b","c"};
        Arrays.stream(arr);

        // 3. Using Stream.of()
        Stream<String> a = Stream.of("a", "b");
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        // 4. Infinte Stream
        Stream<Integer> generate = Stream.generate(() -> 1);
        Stream.iterate(1, x -> x + 1);
    }
}
