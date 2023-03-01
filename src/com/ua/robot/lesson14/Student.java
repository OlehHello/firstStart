package com.ua.robot.lesson14;

public class Student extends People{
    private String name;
    private String surname;
    private int group;
    private int course;
    private String faculty;

    public Student() {
    }

    public Student(String name, String surname, int group, int course, String faculty) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.course = course;
        this.faculty = faculty;
    }

    public void saySomething() {
        System.out.println("Hello, my name is " + name + " " + surname + " and I am a student in group " + group + " in course " + course + " and I am studying " + faculty);
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
