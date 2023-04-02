package com.ua.robot.lesson22;

import jdk.dynalink.linker.LinkerServices;

import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {

        final int NUMBEROFSTUDENTS = 10;
        List<Student> studentsInArray = new ArrayList<>();

        for (int i = 0; i < NUMBEROFSTUDENTS; i++) {
            studentsInArray.add(new Student());
        }

        Instant start = Instant.now();
        studentsInArray.forEach(student -> System.out.print(student.getSurname() + " " + student.getAvarageGrade() + " "));
        System.out.println();

        Collections.sort(studentsInArray, (o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        studentsInArray.forEach(student -> System.out.print(student.getSurname() + " " + student.getAvarageGrade() + " "));
        System.out.println();

        Collections.sort(studentsInArray, (o1, o2) -> o1.getAvarageGradeAsInteger().compareTo(o2.getAvarageGradeAsInteger()));
        studentsInArray.forEach(student -> System.out.print(student.getSurname() + " " + student.getAvarageGrade() + " "));
        System.out.println();

        Instant end = Instant.now();
        System.out.println("Run time: " + Duration.between(start, end).toMillis() + " ms");

        List<Student> studentsInLinked = new LinkedList<>();

        for (int i = 0; i < NUMBEROFSTUDENTS; i++) {
            studentsInLinked.add(new Student());
        }

        start = Instant.now();
        studentsInLinked.forEach(student -> System.out.print(student.getSurname() + " " + student.getAvarageGrade() + " "));
        System.out.println();

        Collections.sort(studentsInLinked, (o1, o2) -> o1.getSurname().compareTo(o2.getSurname()));
        studentsInLinked.forEach(student -> System.out.print(student.getSurname() + " " + student.getAvarageGrade() + " "));
        System.out.println();

        Collections.sort(studentsInLinked, (o1, o2) -> o1.getAvarageGradeAsInteger().compareTo(o2.getAvarageGradeAsInteger()));
        studentsInLinked.forEach(student -> System.out.print(student.getSurname() + " " + student.getAvarageGrade() + " "));
        System.out.println();

        end = Instant.now();
        System.out.println("Run time: " + Duration.between(start, end).toMillis() + " ms");
    }
}
