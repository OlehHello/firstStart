package com.ua.robot.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ss1 = new Scanner(System.in);
        Scanner ss2 = new Scanner(System.in);

//first task
        System.out.println("Enter * symbol print times");
        int inputNumber = ss1.nextInt();
        printSymbol(inputNumber);

//second task
        System.out.println("Enter a symbol and print times");
        String inputSymbol = ss2.nextLine();
        inputNumber = ss1.nextInt();
        printSymbol(inputNumber, inputSymbol);

//third task
        System.out.println("Enter your number for the power method");
        inputNumber = ss1.nextInt();
        System.out.println("Your third power of a is " + getPower(inputNumber));

    }

// power method
    static int getPower(int a) {
        return getPower(a, 3);
    }

    static int getPower(int a, int power) {
        if (power == 1) {
            return a;
        } else {
            return a*getPower(a, power-1);
        }
    }

// print method
    static void printSymbol(int number) {
        printSymbol(number, "*");
    }

    static void printSymbol(int number, String symbol) {
        for(int i = 0; i < number; i++) {
            System.out.print(symbol);
        }
    }


}