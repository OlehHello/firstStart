package com.ua.robot.lesson32;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        TwoThreads runmne1 = new TwoThreads();

        Field[] fields = TwoThreads.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                switch (field.getName()) {
                    case "ini":
                        field.set(runmne1, 1);
                        break;
                    case "fin":
                        field.set(runmne1, 11);
                        break;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        Thread t1 = new Thread(runmne1);
        Thread t2 = new Thread(runmne1);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
//        t2.setDaemon(true);
        t1.start();
        t2.start();

//        try {
//            Thread.sleep(2000);
//            t1.interrupt();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Выполнение программы завершено");

//        Egg egg = new Egg();
//        Thread t3 = new Thread(egg);
//        Chicken chicken = new Chicken();
//        Thread t4 = new Thread(chicken);
//        chicken.setEggThread(egg);
//        egg.setChickenThread(chicken);
//        t3.setPriority(Thread.MIN_PRIORITY);
//        t4.setPriority(Thread.MAX_PRIORITY);
//        t3.start();
//        t4.start();
    }
}
