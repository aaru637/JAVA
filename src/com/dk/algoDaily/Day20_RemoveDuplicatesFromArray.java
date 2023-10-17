package com.dk.algoDaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day20_RemoveDuplicatesFromArray {
    private static List<Integer> removeDuplicates(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        for (int i : arr) {
            if (result.contains(i)) {
                continue;
            } else {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String... args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 3, 1, 2, 1, 2));
        System.out.println(removeDuplicates(arr));
    }
}