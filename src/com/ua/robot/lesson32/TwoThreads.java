package com.ua.robot.lesson32;

public class TwoThreads implements Runnable {
    private int ini = 0;
    private int fin = 10;

    @Override
    public void run() {
        try {
            for (int i = ini; i < fin; i++) {
                System.out.println("Thread:" + Thread.currentThread().getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("Произошла ошибка");
        }
    }
}
