package com.ua.robot.lesson33;

public class Main {
//    public static int i = 0;

    public static void main(String[] args) throws InterruptedException {

        WorkingThread workingThread = new WorkingThread();
        workingThread.setDaemon(true);
        workingThread.setPriority(Thread.MIN_PRIORITY);
        workingThread.start();

        long j = 0;
        while (workingThread.getI() != 5) {
            System.out.flush();
            j++;
        }
//        workingThread.interrupt();
        System.out.println("5 was found in " + j + " checks");

    }
}