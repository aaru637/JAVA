package com.dk.algoDaily;

public class Day12_SubstringInString {

    private static int subStringInString(String input, String subString) {
        int start = 0, end = input.length() - 1, i = 0;
        while (start < end) {
            if (i >= subString.length()) {
                break;
            } else if (input.charAt(start) == subString.charAt(i)) {
                start++;
                i++;
            } else {
                start++;
                i = 0;
            }
        }
        return (i == 0) ? -1 : (start - i);
    }

    public static void main(String... args) {
        String input = "home is where your cat is";
        String subString = "cat";
        System.out.println(subStringInString(input, subString));
    }
}
