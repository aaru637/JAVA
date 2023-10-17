package com.dk.leetCode;

public class Q_1528_ShuffleString {

    private static String shuffleString(String input, int... indices) {
        char[] result = new char[input.length()];
        for(int i = 0 ; i < input.length() ; i++) {
            result[indices[i]] = input.charAt(i);
        }
        return new String(result);
    }
    public static void main(String... args) {
        String input = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(shuffleString(input, indices));
    }
}
