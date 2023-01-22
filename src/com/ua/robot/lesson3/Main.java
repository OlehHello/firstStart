package com.ua.robot.lesson3;

public class Main {
    public static void main(String[] args) {
        int a = 5; // first int
        int b = 2; // second int
        System.out.println("That's a + b = " + (a + b));
        System.out.println("That's a - b = " + (a - b));
        System.out.println("That's a + b = " + (a * b));
        System.out.println("That's a / b = " + (a / b));
        System.out.println("That's a++ + ++a = " + (a++ + ++a));
        a = 5;
        System.out.println("That's ++a + a++ = " + (++a + a++));
    }
}
