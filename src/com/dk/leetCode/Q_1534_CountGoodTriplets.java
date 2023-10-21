package com.dk.leetCode;

public class Q_1534_CountGoodTriplets {

    private static int countGoodTriplets(int a, int b, int c, int... arr) {
        int result = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b && Math.abs(arr[i] - arr[k]) <= c) {
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String... args) {
        int[] arr = { 3, 0, 1, 1, 9, 7 };
        int a = 7, b = 2, c = 3;
        System.out.println(countGoodTriplets(a, b, c, arr));
    }
}
