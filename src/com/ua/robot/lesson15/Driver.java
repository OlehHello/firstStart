package com.ua.robot.lesson15;

public class Driver extends Human implements Drivable{

    @Override
    public void drive() {
        Drivable.super.drive();
        System.out.println("Driver is driving");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from driver");
    }
}
