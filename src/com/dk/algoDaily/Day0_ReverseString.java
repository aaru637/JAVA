package com.dk.algoDaily;

public class Day0_ReverseString {

    private static String reverseastring(String input) {
        int start = 0, end = input.length() - 1;
        char[] array = input.toCharArray();
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(array);
    }

    public static void main(String... args) {
        String input = "reverseastring";
        System.out.println(reverseastring(input));
    }
}
