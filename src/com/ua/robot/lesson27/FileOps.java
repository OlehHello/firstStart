package com.ua.robot.lesson27;

import java.io.*;

public class FileOps {

    public static final String FILE_NAME = "test.txt";

    public void writeToFile(String text) {
        try (OutputStream os = new FileOutputStream(FILE_NAME); OutputStreamWriter osw = new OutputStreamWriter(os)) {
            osw.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void appendToFile(String text) {
        try (OutputStream os = new FileOutputStream(FILE_NAME, true); OutputStreamWriter osw = new OutputStreamWriter(os)) {
            osw.append(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String readFromFile() {
        try (InputStream is = new FileInputStream(FILE_NAME); InputStreamReader isr = new InputStreamReader(is)) {
//            return isr.readLine();
//            return isr.read()

            return new BufferedReader(isr).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
