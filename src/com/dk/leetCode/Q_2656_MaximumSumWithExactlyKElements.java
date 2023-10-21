package com.dk.leetCode;

import java.util.Arrays;

public class Q_2656_MaximumSumWithExactlyKElements {

    private static int maximumSumWithExactlyKElements(int k, int... nums) {
        int result = 0;
        int max = Arrays.stream(nums).reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));
        while (k != 0) {
            result += max;
            max++;
            k--;
        }
        return result;
    }

    public static void main(String... args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(maximumSumWithExactlyKElements(3, nums));
    }
}
