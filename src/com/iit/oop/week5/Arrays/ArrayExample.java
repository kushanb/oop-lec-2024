package com.iit.oop.week5.Arrays;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] scores = new int[5];
        System.out.println(Arrays.toString(scores));

        scores[0] = 5;
        scores[1] = 10;
        scores[3] = 7;

        System.out.println(Arrays.toString(scores));

        int[] nums = {3, 7, 5, 9};
        System.out.println(Arrays.toString(nums));

        printArray(scores);

    }

    public static void printArray(int[] array) {
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("An error occurred while trying to loop the array");
        }
    }
}
