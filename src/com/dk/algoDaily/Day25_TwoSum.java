package com.dk.algoDaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day25_TwoSum {

    private static List<Integer> twoSum(List<Integer> arr, int sum) {
        int start = 0, end = arr.size() - 1;
        while (start < end) {
            if ((arr.get(start) + arr.get(end)) == sum) {
                return new ArrayList<>(Arrays.asList(arr.get(start), arr.get(end)));
            } else if ((arr.get(start) + arr.get(end)) < sum) {
                start++;
            } else {
                end--;
            }
        }
        return new ArrayList<>(Arrays.asList(-1, -1));
    }

    public static void main(String... args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 6, 7, 9));
        int sum = 5;
        System.out.println(twoSum(arr, sum));
    }
}
