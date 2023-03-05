package com.ua.robot.lesson15;

public class Pilot extends Human implements Drivable{
    @Override
    public void drive() {
        Drivable.super.drive();
        System.out.println("Pilot is driving");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Pilot");
    }
}
