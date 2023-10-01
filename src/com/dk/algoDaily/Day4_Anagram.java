package com.dk.algoDaily;

import java.util.Arrays;

public class Day4_Anagram {

    private static boolean isAnagram(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return false;
        }
        char[] array1 = input1.toCharArray();
        char[] array2 = input2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return String.valueOf(array1).equals(String.valueOf(array2));
    }

    public static void main(String... args) {
        String input1 = "racecar";
        String input2 = "carrace";
        System.out.println(isAnagram(input1, input2));
    }
}
