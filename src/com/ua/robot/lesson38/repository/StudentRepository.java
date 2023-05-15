package com.ua.robot.lesson38.repository;

import com.ua.robot.lesson38.domain.Student;

import java.util.List;

public interface StudentRepository {

    void dropDatabase();

    void createDatabase();

    void save(Student student);

    List<Student> findAll();

    Student findById(int id);
}