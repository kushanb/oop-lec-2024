package com.iit.oop.week5.ExceptionHandling;

import java.util.Scanner;

public class RandomCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num 1: ");
        int a = scanner.nextInt();
        System.out.print("Enter num2: ");
        int b = scanner.nextInt();

        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException exception) {
            System.out.println("An error occurred while trying to divide numbers");
        } catch (Exception exception) {
            System.out.println("An unknown error occurred");
        }

        try {
            calculateNumbers(a, b);
        } catch (Exception e) {
            System.out.println("");
        }


    }

    public static void calculateNumbers(int a, int b) throws Exception {
        if (a == b) {
            throw new EqualNumberException("A and B should not be equal");
        }
        System.out.println("A + B = " + (a+b));
    }
}
