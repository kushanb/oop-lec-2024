package com.iit.oop.week3;

public class Main {
    public static void main(String[] args) {

        Person teacher = new Teacher("John Doe", "1st Jan", 10000.00);
        Person student = new Student("Mike", "1st Feb", 123);


        if(teacher instanceof Teacher) {
            Teacher teacher1 = (Teacher) teacher;
            teacher1.getSalary();
        }

//        teacher1.walk();
//        teacher1.talk();
//        teacher.getSalary;
        student.walk();
        student.talk();

        /*
    Naming Conventions
        lowerCamelCase
        UpperCamelCase
        snake_case
        SCREAMING_CASE
        kebab-case
    */

        System.out.println(Teacher.CLASS_NAME);
    }
}
