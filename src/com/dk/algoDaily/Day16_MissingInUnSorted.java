package com.dk.algoDaily;

import java.util.Arrays;

public class Day16_MissingInUnSorted {

    private static String[] missingInUnSorted(int lower, int upper, int... arr) {
        String temp = String.valueOf(Arrays.toString(arr));
        String result = "";
        for (int i = lower; i <= upper; i++) {
            if (temp.contains(String.valueOf(i))) {
                continue;
            } else {
                result += i + ",";
            }
        }
        return result.split(",");
    }

    public static void main(String... args) {
        int[] arr = { 2, 5 };
        int lowerBound = 1, upperBound = 9;
        System.out.println(Arrays.toString(missingInUnSorted(lowerBound, upperBound, arr)));
    }
}
