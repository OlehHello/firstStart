package com.ua.robot.lesson17;

public class Main {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        int day = 3;
        dayOfWeek = dayOfWeek.getDayOfWeek(day);
        System.out.println(dayOfWeek.toString() +" is " + dayOfWeek.getOrder() + " day of week");


        //System.out.println(DayOfWeek.SUNDAY.ordinal());
    }


}