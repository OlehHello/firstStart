package com.ua.robot.lesson12;

public class Human extends Creature{
    int count = 0;
    private String race;
    {
        count++;
        System.out.println("First child class constructor is " + count);
    }
    public Human() {
        count++;
        System.out.println("Second child class constructor is " + count);
    }
    public Human(String name, int age, String race) {
        super(name, age);
        this.race = race;
        count++;
        System.out.println("Third child class constructor is " + count);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
