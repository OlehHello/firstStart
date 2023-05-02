package com.ua.robot.lesson33;

public class WorkingThread extends Thread {
    private int i;

    @Override
    public void run() {
        while (true) {
            try {
                i = (int) (Math.random() * 10);
                System.out.println("Random Number: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
    }

    public int getI() {
        return i;
    }

//    public void setI(int i) {
//        this.i = i;
//    }
}
