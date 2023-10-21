package com.dk.leetCode;

import java.util.Arrays;

public class Q_1913_MaximumProductDifferenceBetweenTwoPairs {

    private static int maximumProductDifferenceBetweenTwoPairs(int... nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return (nums[length - 1] * nums[length - 2]) - (nums[0] * nums[1]);
    }

    public static void main(String... args) {
        int[] nums = { 5, 6, 2, 7, 4 };
        System.out.println(maximumProductDifferenceBetweenTwoPairs(nums));
    }
}
