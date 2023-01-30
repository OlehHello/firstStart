package com.ua.robot.lesson5;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your long type a");
        long a = ss.nextLong(); // long         float b = ss.nextFloat(); // second float
        if (a %2 == 0){
            System.out.println("Your a is even");
        } else {
            System.out.println("Your a is odd");
        }

    }
}
