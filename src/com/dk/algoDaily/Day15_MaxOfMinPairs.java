package com.dk.algoDaily;

import java.util.Arrays;

public class Day15_MaxOfMinPairs {

    private static int maxOfMinPairs(int... arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i += 2) {
            sum += Math.min(arr[i], arr[i + 1]);
        }
        return sum;
    }

    public static void main(String... args) {
        int[] arr = { 3, 4, 2, 5 };
        System.out.println(maxOfMinPairs(arr));
    }
}
