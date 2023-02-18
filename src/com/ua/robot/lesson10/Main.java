package com.ua.robot.lesson10;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setName("Dmytro");
        student1.setSurname("Petrenko");
        student1.setAge(20);
        student1.setMark(48);
        student1.printInfo();
        System.out.println(student1.toString());

        Lecturer lecturer1 = new Lecturer("Olexiy","Kapustnyk","Java",4800f);

        lecturer1.printInfo();
//        System.out.println(lecturer1.toString());
        lecturer1.setSalary(5500f);
        lecturer1.printInfo();

        Arrays arr = new Arrays();
        arr.printArray();
        arr.fillArrayRandom(10, 100);
        arr.printArray();
        arr.sortArrayHigher();
        arr.printArray();
        arr.sortArrayLower();
        arr.printArray();

    }
}
