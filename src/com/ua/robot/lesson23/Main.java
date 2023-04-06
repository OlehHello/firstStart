package com.ua.robot.lesson23;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<String> surnames = List.of("Иванов",
                "Петров",
                "Сидоров",
                "Иванов",
                "Петров",
                "Сидоров",
                "Сиров",
                "Ивов",
                "Петов",
                "Сидоров",
                "Сиров",
                "Сидоров",
                "Сиров",
                "Ивов",
                "Петов",
                "Сидоров",
                "Иванов",
                "Петров",
                "Сидоров",
                "Сиров");

//        Map<String, Integer> map0 = new TreeMap<>();
//        surnames.forEach(surname -> map0.put(surname, map0.getOrDefault(surname, 0) + 1));
//        System.out.println(map0);

        Map<String, Long> map2 = new TreeMap<>(surnames.stream().collect(Collectors.groupingBy(String::toString, Collectors.counting())));
        System.out.println(map2);

        List<Integer> randomNumbers = Stream.generate(() -> (int) (Math.random() * 10 + 1)).limit(10).collect(Collectors.toList());
        int sum = randomNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(randomNumbers + " " + sum);

    }
}
