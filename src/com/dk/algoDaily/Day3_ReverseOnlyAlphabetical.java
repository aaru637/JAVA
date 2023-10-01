package com.dk.algoDaily;

public class Day3_ReverseOnlyAlphabetical {

    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    private static String reverseOnlyAlphabetical(String input) {
        int start = 0, end = input.length() - 1;
        char[] array = input.toCharArray();
        while (start < end) {
            if (!ALPHABETS.contains(String.valueOf(array[start]))) {
                start++;
            } else if (!ALPHABETS.contains(String.valueOf(array[end]))) {
                end--;
            } else {
                char temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(array);
    }

    public static void main(String... args) {
        String input = "sea!$hells3";
        System.out.println(reverseOnlyAlphabetical(input));
    }
}
