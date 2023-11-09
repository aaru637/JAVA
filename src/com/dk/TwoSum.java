package com.dk;

public class TwoSum {

    private static Boolean twoSum(int sum, int... arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int k = 0; k < i; k++) {
                if (arr[i] + arr[k] == sum) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String... args) {
        int[] arr = { 1, 4, 10, 3 };
        System.out.println(twoSum(5, arr));
    }
}
