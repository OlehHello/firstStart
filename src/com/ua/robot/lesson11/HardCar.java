package com.ua.robot.lesson11;

public class HardCar extends Car{

    //private String type;
    public HardCar(String model, String color, String type, int year, int speed) {
        super(model, color, "Hard", year, speed);
    }

    @Override
    public String getType() {
        return "Hard";
    }

    @Override
    public void setType(String type) {
        this.type = "Hard";
    }
}
