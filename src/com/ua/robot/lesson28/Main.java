package com.ua.robot.lesson28;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        private static final String FILE_NAME = "test.txt";
        String FILE_NAME = "test.txt";

        FileOps fileOps = new FileOps();
        fileOps.writeToFile(FILE_NAME, "Hello");
        fileOps.appendToFile(FILE_NAME, " World");
        String str = fileOps.readFromFile(FILE_NAME);
        System.out.println(str);
        fileOps.deleteFile(FILE_NAME);
//        fileOps.deleteFile(FILE_NAME);
    }
}