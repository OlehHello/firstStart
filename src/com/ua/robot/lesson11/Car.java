package com.ua.robot.lesson11;

public class Car {
    protected String model;
    protected String color;
    protected String type;
    protected int year;
    protected int speed;

    public Car(String model, String color, String type, int year, int speed) {
        this.model = model;
        this.color = color;
        this.type = type;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println("Модель автомобиля: " + model);
        System.out.println("Цвет автомобиля: " + color);
        System.out.println("Тип автомобиля: " + type);
        System.out.println("Год выпуска: " + year);
        System.out.println("Скорость автомобиля: " + speed);
    }
}
