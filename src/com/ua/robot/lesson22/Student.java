package com.ua.robot.lesson22;

public class Student implements Comparable<Student> {
    private String surname;
    private int avarageGrade;


    private final static int MAXSURNAMELENGTH = 10;
    private final static int MAXAVARAGELENGTH = 10;


    public Student() {
        this.surname = generateName(MAXSURNAMELENGTH);
        this.avarageGrade = (int) (Math.random()*MAXAVARAGELENGTH) + 1;
    }

    public Student(String surname, int avarageGrade) {
        this.surname = surname;
        this.avarageGrade = avarageGrade;
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

    public void printInfo() {
        System.out.println("Surname: " + this.surname + " Avarage grade: " + this.avarageGrade);
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAvarageGrade() {
        return avarageGrade;
    }

    public Integer getAvarageGradeAsInteger() {
        return (Integer) avarageGrade;
    }

    public void setAvarageGrade(int avarageGrade) {
        this.avarageGrade = avarageGrade;
    }
}
