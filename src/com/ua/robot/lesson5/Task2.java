package com.ua.robot.lesson5;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your a and b here ");
        float a = ss.nextFloat(); // first float
        float b = ss.nextFloat(); // second float
        if (a <= b){
            System.out.println("Your a is lowerest");
        } else {
            System.out.println("Your b is lowerest");
        }

    }
}
