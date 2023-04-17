package com.ua.robot.lesson26;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        int number;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                int number = scanner.nextInt();
                System.out.println("SquareRoot is: " + getSquareRoot(number));
                break;
            } catch (InputMismatchException e) {
//                e.printStackTrace();
                System.out.println("Wrong input");
                scanner.nextLine();
            } catch (LessThanZeroException e) {
                System.out.println("Value is less than zero");
            }
        }
    }

    private static double getSquareRoot(int number) throws LessThanZeroException {
        if (number < 0) {
//                throw new IllegalArgumentException("Некорректное значение");
            throw new LessThanZeroException();
        } else {
            return Math.sqrt(number);
        }
    }

}
