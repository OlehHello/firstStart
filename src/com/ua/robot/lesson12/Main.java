package com.ua.robot.lesson12;

public class Main {
    public static void main(String[] args) {
        Creature creature = new Creature();
        creature.setName("Rabit");
        creature.setAge(2);

        //Human human = new Human();
        Human human = new Human("Denny", 33, "Asian");
        human.setName("Bonny");
        human.setAge(22);
        human.setRace("European");
    }
}
