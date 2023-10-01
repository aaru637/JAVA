package com.dk.algoDaily;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day1_ArrayIntersection {

    private static Object[] arrayIntersection(int[] arr1, int[] arr2, int a, int b) {
        Set<Integer> first = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i : arr1) {
            first.add(i);
        }
        for (int i : arr2) {
            if (first.contains(i)) {
                result.add(i);
            }
        }
        return result.toArray();
    }

    public static void main(String... args) {
        int[] arr1 = { 4, 9, 5 };
        int[] arr2 = { 9, 4, 9, 8, 4 };
        int m = arr1.length;
        int n = arr2.length;
        System.out.println(Arrays.toString(arrayIntersection(arr1, arr2, m, n)));
    }
}
