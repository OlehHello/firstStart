package com.ua.robot.lesson11;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", "Black", "Medium",1990,210);
        //car1.printInfo();
        System.out.println(car1.getModel() + " " + car1.getType());

        HardCar car2 = new HardCar(car1.getModel(), car1.getColor(), car1.getType(), car1.getYear(), car1.getSpeed());
        //car2.printInfo();
        System.out.println(car2.getModel() + " " + car2.getType());

        LightCar car3 = new LightCar(car1.getModel(), car1.getColor(), car1.getType(), car1.getYear(), car1.getSpeed());
        //car3.printInfo();
        System.out.println(car3.getModel() + " " + car3.getType());
    }
}
