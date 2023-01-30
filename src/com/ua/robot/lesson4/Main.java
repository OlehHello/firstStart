package com.ua.robot.lesson4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your line here ");
        String line = ss.nextLine(); // your string
        int length = line.length(); // length
        System.out.println("That's your line " + line);
        System.out.println("That's line length " + length);
        System.out.println("That's your lowercase line " + line.toLowerCase());
        System.out.println("That's your uppercase line " + line.toUpperCase());
        System.out.println("That's your first char " + line.charAt(0));
        System.out.println("That's your last char " + line.charAt(length-1));
    }
}
