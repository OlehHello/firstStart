package com.ua.robot.lesson6;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int fib1 = 0; // first fib
        int fib2 = 1; // second fib
        int limit = 100; // limit
        System.out.println("Fibonachi numbers below " + limit);
        while (fib1 < limit) {
            System.out.print(fib1 + " ");
            int temp = fib1;
            fib1 = fib2;
            fib2 = fib2 + temp;
        }
    }
}
