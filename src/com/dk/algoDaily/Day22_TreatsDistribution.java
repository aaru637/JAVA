package com.dk.algoDaily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day22_TreatsDistribution {

    private static int treatDistribution(List<Integer> arr) {
        List<Integer> brother = new ArrayList<>();
        List<Integer> sister = new ArrayList<>();
        int bCount = 0, sCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 != 0) {
                if (brother.contains(arr.get(i))) {
                    continue;
                } else {
                    brother.add(arr.get(i));
                    bCount++;
                }
            } else {
                if (sister.contains(arr.get(i))) {
                    continue;
                } else {
                    sister.add(arr.get(i));
                    sCount++;
                }
            }
        }
        return Math.max(sCount, bCount);
    }

    public static void main(String... args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 2, 4));
        System.out.println(treatDistribution(arr));
    }
}
