package com.dk.algoDaily;

import java.util.ArrayList;
import java.util.List;

public class Day23_LeastMissingPositiveNumber {
    private static int leastMissingPositiveNumber(List<Integer> arr) {
        if (arr.size() == 2) {
            return Math.max(arr.get(0), arr.get(1));
        }
        arr.sort(null);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                continue;
            }
            if (!arr.contains(i)) {
                return i;
            }
        }
        return arr.get(0);
    }

    public static void main(String... args) {
        List<Integer> arr = new ArrayList<>(List.of(-1, -2, -3));
        System.out.println(leastMissingPositiveNumber(arr));
    }
}
