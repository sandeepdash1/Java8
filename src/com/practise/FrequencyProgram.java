package com.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyProgram {
    public static void main(String[] args) {
        // Find the most frequent Character
        String input = "ssuccess";
        Map<Character, Long> map = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        Optional<Map.Entry<Character, Long>> max = map
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max);

        // Find the most frequent word
        String text = "Java is great and Java is powerful and Java is fast";
        Optional<Map.Entry<String, Long>> mostFrequentWord = Arrays.stream(text.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        mostFrequentWord.ifPresent(entry ->
                System.out.println("Most frequent word: " + entry.getKey() +
                        " (count: " + entry.getValue() + ")"));

        // Find 2nd highest number
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 40, 30);
        Optional<Integer> secondHighest =
                numbers.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();
        numbers.forEach(System.out::println);
        secondHighest.ifPresent(System.out::println);
    }
}
