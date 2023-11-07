package com.dk;

import java.util.Arrays;

/**
 * SubArraySum
 */
public class SubArraySum {

    private static int[] sumIndex(int value, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == value) {
                    return new int[] { i + 1, j + 1 };
                } else if (sum > value) {
                    break;
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String... args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        System.out.println(Arrays.toString(sumIndex(3, arr)));
    }
}