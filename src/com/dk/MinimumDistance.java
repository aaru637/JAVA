package com.dk;

import java.util.ArrayList;
import java.util.List;

/**
 * MinimumDistance
 */
public class MinimumDistance {

    private static List<Integer> indices(int value, int... input) {
        List<Integer> temp = new ArrayList<>();
        for(int i = 0 ; i < input.length ; i++) {
            if(input[i] == value) {
                temp.add(i);
            }
        }
        return temp;
    }

    private static int minDistance(int start, int end, int... input) {
        int min = Integer.MAX_VALUE;
        List<Integer> first = indices(start, input);
        List<Integer> second = indices(end, input);
        System.out.println(first);
        System.out.println(second);
        for(int i = 0 ; i < first.size() ; i++) {
            for(int j = 0 ; j < second.size() ; j++) {
                int temp = Math.abs(first.get(i) - second.get(j));
                if(temp < min) {
                    min = temp;
                }
            }
        }
        return min;
    }
    public static void main(String... args) {
        int[] input = {3, 2, 4, 1, 2, 5, 6, 2};
        System.out.println(minDistance(1, 2, input));
    }
}