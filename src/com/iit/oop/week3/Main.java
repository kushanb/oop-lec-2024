package com.iit.oop.week3;

public class Main {
    public static void main(String[] args) {

        Object teacher = new Teacher("John Doe", "1st Jan", 10000.00);
        Person student = new Student("Mike", "1st Feb", 123);

        Teacher teacher1 = (Teacher) teacher;

        teacher1.walk();
        teacher1.talk();
        student.walk();
        student.talk();
    }
}
