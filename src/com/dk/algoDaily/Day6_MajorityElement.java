package com.dk.algoDaily;

import java.util.HashMap;
import java.util.Map;

public class Day6_MajorityElement {

    private static int majorityElement(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        int max = Integer.MIN_VALUE, maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result.get(i) == null) {
                result.put(i, 1);
                maxValue = (max > 1) ? maxValue : arr[i];
                max = Math.max(max, 1);

            } else {
                int count = result.get(i);
                result.put(i, ++count);
                maxValue = (max > count) ? maxValue : arr[i];
                max = Math.max(max, count);
            }
        }
        return maxValue;
    }

    public static void main(String... args) {
        int[] arr = { 4, 2, 4 };
        System.out.println(majorityElement(arr));
    }
}
