package com.dk.algoDaily;

import java.util.HashMap;
import java.util.Map;

public class Day8_SingleLonelyNumber {

    private static int singleLonelyNumber(int[] arr) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int i : arr) {
            if (result.get(i) == null) {
                result.put(i, 1);
            } else {
                int count = result.get(i);
                result.put(i, ++count);
            }
        }
        for (Map.Entry<Integer, Integer> map : result.entrySet()) {
            if (map.getValue() == 1) {
                return map.getKey();
            }
        }
        return -1;
    }

    public static void main(String... args) {
        int[] arr = { 4, 4, 6, 1, 3, 1, 3 };
        System.out.println(singleLonelyNumber(arr));
    }
}
