package com.iit.oop.week3;

public class Teacher extends Person {
    private double salary;

    /**
     * Constructor for the teacher class
     *
     * @param name name of the teacher
     * @param dob date of birth
     * @param salary monthly salary
     */
    public Teacher(String name, String dob, double salary) {
        super(name, dob);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void talk() {
        System.out.println(getName() + " who is teacher is talking...");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "who is a teacher is walking...");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name:" + getName() +
                "dob:" + getDob() +
                "salary:" + salary +
                '}';
    }
}
