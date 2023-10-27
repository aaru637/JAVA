package com.dk;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

    private static int duplicateNumberTraditional(int... arr) {
        for(int i = 0 ; i < arr.length ; i++) {
            for(int j = 0 ; j < arr.length ; j++) {
                if(i != j && arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    private static int duplicateNumberEfficient(int... arr) {
        List<Integer> temp = new ArrayList<>();
        for(int i : arr) {
            if(temp.contains(i)) {
                return i;
            }
            else {
                temp.add(i);
            }
        }
        return -1;
    }
    public static void main(String... args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7};
        System.out.println(duplicateNumberTraditional(arr));
        System.out.println(duplicateNumberEfficient(arr));
    }
}
