package com.ua.robot.lesson14;

public class Teacher extends People{
    private String name;
    private String surname;
    private String subject;

    public Teacher() {

    }
    public Teacher(String name, String surname, String subject) {
        this.name = name;
        this.surname = surname;
        this.subject = subject;
    }

    public void saySomething() {
        System.out.println("Hello, my name is " + name + " " + surname + " and I teach " + subject);
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
