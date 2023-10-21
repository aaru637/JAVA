package com.dk.leetCode;

import java.util.Arrays;

public class Q_2037_MinimumNumberOfMovesToSeatEveryone {

    private static int minimumNoOfMovesToSeatEveryone(int[] seats, int[] students) {
        int sum = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            sum += (Math.abs(seats[i] - students[i]));
        }
        return sum;
    }

    public static void main(String... args) {
        int[] seats = { 4, 1, 5, 9 };
        int[] students = { 1, 3, 2, 6 };
        System.out.println(minimumNoOfMovesToSeatEveryone(seats, students));
    }
}
