package com.iit.oop.week5.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<String> letters = new ArrayList<>();
        letters.add("Z");
        letters.add("C");
        letters.add("A");
        letters.add("S");
        letters.add("L");
        letters.add("Q");
        System.out.println("Without sorting: " + letters);
        Collections.sort(letters);
        System.out.println("After Sorting: " + letters);

        Employee emp1 = new Employee(1, "John Doe", 20, 1200);
        Employee emp2 = new Employee(4, "Jane Doe", 20, 1500);
        Employee emp3 = new Employee(2, "Mike", 20, 800);
        Employee emp4 = new Employee(5, "Tim", 20, 2000);
        Employee emp5 = new Employee(3, "Spike", 20, 1300);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);

        // Comparing 2 objects
        int higher = emp2.compareTo(emp1);
        if(higher > 0) {
            System.out.println(emp2.getName() + " has a higher salary");
        } else if (higher == 0) {
            System.out.println("Both have the same salary");
        } else {
            System.out.println(emp1.getName() + " has a higher salary");
        }

        // Sorting the list
        System.out.println("Unsorted Arraylist: " + employeeList);
        Collections.sort(employeeList);
        System.out.println("Sorted Arraylist: " + employeeList);


    }
}
