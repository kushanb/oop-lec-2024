package com.iit.oop.week3;

public class Student extends Person {
    private int studentId;

    /**
     * Init without the person details
     * @param studentId
     */
    public Student(int studentId) {
        this.studentId = studentId;
    }

    /**
     * Init with all the required details
     *
     * @param name
     * @param dob
     * @param studentId
     */
    public Student(String name, String dob, int studentId) {
        super(name, dob);
        this.studentId = studentId;
    }

    @Override
    public void walk() {
        System.out.println(getName() + " who is student is walking");
    }

    @Override
    public void talk() {
        System.out.println(getName() + " who is student is talking");
    }
}
