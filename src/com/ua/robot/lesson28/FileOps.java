package com.ua.robot.lesson28;

import java.nio.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileOps {


//    public static final String FILE_NAME = "test.txt";
//    private Path path;
//
//    public FileOps() {
//        path = Path.of(FILE_NAME);
//    }

    public void writeToFile(String filename, String text) throws IOException {
//        Files.write(path.resolve(filename), text.getBytes());
        Files.write(Path.of(filename), text.getBytes());
    }

    public void appendToFile(String filename, String text) throws IOException {
        Files.write(Path.of(filename), text.getBytes(), StandardOpenOption.APPEND);
//        Files.write(path.resolve(filename), text.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
    }

    public String readFromFile(String filename) throws IOException {
        return new String(Files.readAllBytes(Path.of(filename)));
    }

    public void deleteFile(String filename) throws IOException {
        Files.delete(Path.of(filename));
    }

}
