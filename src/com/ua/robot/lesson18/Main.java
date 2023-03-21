package com.ua.robot.lesson18;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list);

        List<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < 2000000; i++) {
            list2.add((int)(Math.random() * 10) + 1);
        }
        System.out.println(list2);

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student());
        }
        for (int i = 0; i < 10; i++) {
            students.get(i).printInfo();
        }
    }
}
