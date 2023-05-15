package com.ua.robot.lesson38;

import com.ua.robot.lesson38.domain.Student;
import com.ua.robot.lesson38.repository.StudentMysqlRepository;
import com.ua.robot.lesson38.repository.StudentRepository;

import java.sql.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentMysqlRepository();
        studentRepository.createDatabase();

        Student s1 = Student.builder()
                .age(20)
                .name("Petruk")
                .groupId(1)
                .build();
        studentRepository.save(s1);
        s1 = Student.builder()
                .age(30)
                .name("Donald")
                .groupId(2)
                .build();
        studentRepository.save(s1);
        s1 = Student.builder()
                .age(40)
                .name("Ivan")
                .groupId(3)
                .build();
        studentRepository.save(s1);


        List<Student> students = studentRepository.findAll();
        System.out.println(students);
        studentRepository.dropDatabase();
//
//        Student student = studentRepository.findById(1);
//        System.out.println(student);

    }
}