package com.dk;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumber {
    private static int uniqueNumber(int... arr) {
        List<Integer> temp = new ArrayList<>();
        int index = 0;
        for(int i : arr) {
            if(temp.contains(i)) {
                index = temp.indexOf(i);
                temp.remove(index);
            }
            else {
                temp.add(i);
            }
        }
        return temp.get(0);
    }
    public static void main(String... args) {
        int arr[] = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6};
        System.out.println(uniqueNumber(arr));
    }
}
