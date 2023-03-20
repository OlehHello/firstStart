package com.ua.robot.lesson18;

public class Student {
    protected String name;
    protected String surname;
    protected int age;
    protected String corse;
    private final static int MAXNAMELENGTH = 5;
    private final static int MAXSURNAMELENGTH = 10;
    private final static int MAXCORSENAMELENGTH = 7;


    public Student() {
        this.name = generateName(MAXNAMELENGTH);
        this.surname = generateName(MAXSURNAMELENGTH);
        this.age = (int) Math.random()*45 + 15;
        this.corse = generateName(MAXCORSENAMELENGTH);

    }

    public Student(String name, String surname, int age, String corse) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.corse = corse;
    }

    private String generateName(int length) {
        length = (int) (Math.random() * length) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append((char) (Math.random() * 26 + 'A'));
        for (int i = 1; i < length; i++) {
            sb.append((char) (Math.random() * 26 + 'a'));
        }
        return sb.toString();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCorse() {
        return corse;
    }

    public void setCorse(String corse) {
        this.corse = corse;
    }

    public void printInfo() {
        System.out.println("Name: " + name + " Surname: " + surname + " Age: " + age + " Corse: " + corse);
    }
}
