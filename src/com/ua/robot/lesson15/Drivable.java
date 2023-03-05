package com.ua.robot.lesson15;

public interface Drivable {
    default void drive(){
        System.out.println("Start driving");
    };
}
