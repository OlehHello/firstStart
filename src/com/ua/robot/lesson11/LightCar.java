package com.ua.robot.lesson11;

public class LightCar extends Car {

    //private String type;
    public LightCar(String model, String color, String type, int year, int speed) {
        super(model, color, "Light", year, speed);
    }

    @Override
    public String getType() {
        return "Light";
    }

    @Override
    public void setType(String type) {
        this.type = "Light";
    }
}
