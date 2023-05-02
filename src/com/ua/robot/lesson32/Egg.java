package com.ua.robot.lesson32;

import java.util.Random;

public class Egg extends Thread {

    private Thread chickenThread;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(new Random().nextInt(1000));
                System.out.println("Egg first");
            }
            if (!chickenThread.isAlive()) {
                System.out.println("Egg was first!");
            }
        } catch (InterruptedException e) {

        }
    }

    public void setChickenThread(Thread chickenThread) {
        this.chickenThread = chickenThread;
    }
}
