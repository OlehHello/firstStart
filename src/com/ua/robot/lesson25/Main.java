package com.ua.robot.lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                int number = scanner.nextInt();
                System.out.println(number);
                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Wrong input");
                scanner.nextLine();
            }
        }

    }
}
