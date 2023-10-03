package com.dk.algoDaily;

import java.util.Arrays;

public class Day17_MissingInSorted {

    private static String[] missingInSorted(int... arr) {
        String result = "";
        int start = arr[0], end = arr[arr.length - 1], k = 0;
        int i = start;
        while (i < end) {
            if (i == arr[k]) {
                k++;
            } else {
                result += i + ",";
            }
            i++;
        }
        return result.split(",");
    }

    public static void main(String... args) {
        int[] arr = { 1, 2, 5, 7 };
        System.out.println(Arrays.toString(missingInSorted(arr)));
    }
}
