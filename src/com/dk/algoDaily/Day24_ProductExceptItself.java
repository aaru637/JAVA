package com.dk.algoDaily;

import java.util.ArrayList;
import java.util.List;

public class Day24_ProductExceptItself {

    private static void productExceptItself(List<Integer> arr) {
        int mul = 1;
        for (int i : arr) {
            mul *= i;
        }
        for (int i = 0; i < arr.size(); i++) {
            int copy = arr.get(i);
            arr.remove(i);
            arr.add(i, (mul / copy));
        }
    }

    public static void main(String... args) {
        List<Integer> arr = new ArrayList<>(List.of(1, 2, 4, 16));
        productExceptItself(arr);
        System.out.println(arr);
    }
}
