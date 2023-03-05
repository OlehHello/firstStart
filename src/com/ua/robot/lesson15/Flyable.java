package com.ua.robot.lesson15;

public interface Flyable {
    default void fly(){
        System.out.println("Start flying");
    };

}
