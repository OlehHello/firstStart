package com.ua.robot.lesson27;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        FileOps fileOps = new FileOps();
        fileOps.writeToFile("Hello");
        fileOps.appendToFile(" World");
        String str = fileOps.readFromFile();
        System.out.println(str);
    }
}
