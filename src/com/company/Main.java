package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static final int MIN = 1;                    // minimum values for integers in the array
    private static final int MAX = 10;                   // maximum values for integers in the array
    private static final int ELEMENTS_NUMBER = 8;        // number of elements in the array

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        /*
         * The following for cycle generates an array of integers and sorts it.
         * If it hits the same number twice, it will skip this number. Hence, each number in the array is unique.
         */
        for (int j = 0; j < ELEMENTS_NUMBER; ) {
            int randNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);

            if (ArraySearch.binarySearch(arr, randNum) == -1) {
                arr.add(randNum);
                ++j;
            }
            Collections.sort(arr);
        }

        System.out.println("Sorted array: " + arr);

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // numbers to be searched

        for (Integer number : numbers) {
            int idx = ArraySearch.binarySearch(arr, number);

            if (idx == -1)
                System.out.println("The number " + number + " was not found.");
            else
                System.out.println("The number " + number + " was found on position " + idx + ".");
        }
    }
}


