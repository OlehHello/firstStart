package com.ua.robot.lesson3;

import java.util.Scanner;
public class MainScanner {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your a and b integers here ");
        int a = ss.nextInt(); // first int
        int b = ss.nextInt(); // second int
        System.out.println("That's a + b = " + (a + b));
        System.out.println("That's a - b = " + (a - b));
        System.out.println("That's a + b = " + (a * b));
        System.out.println("That's a / b = " + (a / b));
        System.out.println("That's a++ + ++a = " + (a++ + ++a));
        a = 5;
        System.out.println("That's ++a + a++ = " + (++a + a++));
    }

}
