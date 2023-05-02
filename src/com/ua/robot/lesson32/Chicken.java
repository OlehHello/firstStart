package com.ua.robot.lesson32;

import java.util.Random;

public class Chicken extends Thread {

    private Thread eggThread;

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(new Random().nextInt(1000));
                System.out.println("Chicken first");
            }
            if (!eggThread.isAlive()) {
                System.out.println("Chicken was first!");
            }
        } catch (InterruptedException e) {

        }
    }

    public void setEggThread(Thread eggThread) {
        this.eggThread = eggThread;
    }
}