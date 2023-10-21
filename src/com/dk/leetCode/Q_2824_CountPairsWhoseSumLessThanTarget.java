package com.dk.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Q_2824_CountPairsWhoseSumLessThanTarget {

    private static int countPairsWhoseSumLessTarget(List<Integer> arr, int target) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (i < j && (arr.get(i) + arr.get(j)) < target) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String... args) {
        List<Integer> arr = new ArrayList<>(List.of(-6, 2, 5, -2, -7, -1, 3));
        System.out.println(countPairsWhoseSumLessTarget(arr, -2));
    }
}
