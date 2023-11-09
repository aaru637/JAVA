package com.dk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPermutation {

    private static List<String> list = new ArrayList<>();

    private static void permute(int index, int... arr) {
        if (index == arr.length - 1) {
            list.add(Arrays.toString(arr));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            swap(i, index, arr);
            permute(index + 1, arr);
            swap(i, index, arr);
        }
    }

    private static void swap(int i, int index, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

    public static void main(String... args) {
        int[] arr = { 1, 2, 3 };
        permute(0, arr);
        System.out.println(list);

    }
}
