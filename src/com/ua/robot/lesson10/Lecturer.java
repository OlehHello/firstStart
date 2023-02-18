package com.ua.robot.lesson10;

public class Lecturer {
    private String name;
    private String surname;
    private String subject;
    private float salary;

    public Lecturer(String name, String surname, String subject, float salary) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSubject() {
        return subject;
    }

    public float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setLekturer(String name, String surname, String subject, float salary) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + "\nФамилия: " + surname + "\nПредмет: " + subject + "\nЗарплата: " + salary);
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", subject='" + subject + '\'' +
                ", salary=" + salary +
                '}';
    }
}
