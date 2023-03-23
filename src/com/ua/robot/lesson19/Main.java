package com.ua.robot.lesson19;

import jdk.dynalink.linker.LinkerServices;

import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();
        for (int i = 0; i < 1000; i++) {
            set1.add((int) (Math.random() * 50) + 1);
            set2.add((int)(Math.random() * 50) + 1);
            set3.add((int)(Math.random() * 50) + 1);

        }
//        set1.forEach(System.out::println);
//        set2.forEach(System.out::println);
//        set3.forEach(System.out::println);
        set1.forEach(s-> System.out.print(s + " "));
        System.out.println();
        set2.forEach(s-> System.out.print(s + " "));
        System.out.println();
        set3.forEach(s-> System.out.print(s + " "));
        System.out.println();


    }
}
