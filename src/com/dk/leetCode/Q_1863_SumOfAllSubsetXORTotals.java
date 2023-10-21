package com.dk.leetCode;

public class Q_1863_SumOfAllSubsetXORTotals {

    private static int generateSubSet(int... nums) {
        int total = (int) Math.pow(2, nums.length);
        int finalResult = 0, temp;
        for (int i = 1; i < total; i++) {
            temp = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) > 0) {
                    temp ^= nums[j];
                }
            }
            finalResult += temp;
        }
        return finalResult;
    }

    public static void main(String... args) {
        int[] nums = { 3, 4, 5, 6, 7, 8 };
        System.out.println(generateSubSet(nums));
    }
}
