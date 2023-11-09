package com.dk.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Q_2859_SumOfValuesAtIndicesWithKSetBits
 */
public class Q_2859_SumOfValuesAtIndicesWithKSetBits {

    private static int sumOfValuesAtIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0, count;
        for (int i = 0; i < nums.size(); i++) {
            count = 0;
            String temp = Integer.toBinaryString(i);
            for (char j : temp.toCharArray()) {
                if (String.valueOf(j).equals("1")) {
                    count++;
                }
            }
            if (count == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }

    public static void main(String... args) {
        List<Integer> nums = new ArrayList<>(List.of(4, 3, 2, 1));
        System.out.println(sumOfValuesAtIndicesWithKSetBits(nums, 2));
    }
}