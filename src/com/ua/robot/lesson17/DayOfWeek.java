package com.ua.robot.lesson17;

public enum DayOfWeek {
    MONDAY("first"),
    TUESDAY("second"),
    WEDNESDAY("third"),
    THURSDAY("fourth"),
    FRIDAY("fifth"),
    SATURDAY("sixth"),
    SUNDAY("seventh");

    private String order;
    DayOfWeek(String order) {
        this.order = order;
    }
    public String getOrder() {
        return order;
    }
    public DayOfWeek getDayOfWeek(int day) {
        switch(day)
        {
            case 1:
                return DayOfWeek.MONDAY;
            case 2:
                return DayOfWeek.TUESDAY;
            case 3:
                return DayOfWeek.WEDNESDAY;
            case 4:
                return DayOfWeek.THURSDAY;
            case 5:
                return DayOfWeek.FRIDAY;
            case 6:
                return DayOfWeek.SATURDAY;
            case 7:
                return DayOfWeek.SUNDAY;
            default:
                return null;
        }
    }

}
