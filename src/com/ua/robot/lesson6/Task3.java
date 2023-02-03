package com.ua.robot.lesson6;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int fact = 7;
        long out = 1;
        for (int i = 1; i <= fact; i++) {
            out = out*i;
         }
        System.out.print("Factorial " + fact + " is " + out);
    }
}
