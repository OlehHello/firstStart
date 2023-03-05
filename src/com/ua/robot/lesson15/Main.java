package com.ua.robot.lesson15;

public class Main {
    public static void main(String[] args) {
        Drivable human1 = new Driver();
        Drivable human2 = new Pilot();
        human1.drive();
        human2.drive();
        Flyable bird1 = new Bird();
        Flyable plane1 = new Plane();
        bird1.fly();
        plane1.fly();
    }
}
