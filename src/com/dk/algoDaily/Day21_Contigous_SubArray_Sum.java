package com.dk.algoDaily;

import java.util.ArrayList;
import java.util.List;

public class Day21_Contigous_SubArray_Sum {
    private static boolean contigousSubArraysSum(List<Integer> arr, int value) {
        int sum = 0;
        boolean flag = false;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (add(sum, arr.get(i)) < value) {
                flag = false;
                sum += arr.get(i);
            } else if (add(sum, arr.get(i)) == value) {
                return true;
            } else {
                sum -= arr.get(i);
                i++;
                flag = false;
            }
        }
        return flag;
    }

    private static int add(int a, int b) {
        return a + b;
    }

    public static void main(String... args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 1, 2, 3, -2, 2));
        int sumValue = 2;
        System.out.println(contigousSubArraysSum(arr, sumValue));
    }
}
