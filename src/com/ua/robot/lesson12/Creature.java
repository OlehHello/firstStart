package com.ua.robot.lesson12;

public class Creature {
    static int count = 0;
    private String name;
    private int age;
    {
        count++;
        System.out.println("First parent class constructor count is " + count);
    }
    public Creature() {
        count++;
        System.out.println("Second parent class constructor count is " + count);
    }
    public Creature(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
        System.out.println("Third parent class constructor count is " + count);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
