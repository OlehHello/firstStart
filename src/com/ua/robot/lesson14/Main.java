package com.ua.robot.lesson14;

public class Main {
    public static void main(String[] args) {
        People student = new Student("Ivan", "Ivanov", 4, 1, "Economy");
        People teacher = new Teacher("Petr", "Petrov", "IT");

        student.saySomething();
        teacher.saySomething();
    }
}
