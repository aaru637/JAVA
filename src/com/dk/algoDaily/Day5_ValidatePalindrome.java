package com.dk.algoDaily;

public class Day5_ValidatePalindrome {

    private static boolean validatePalindrome(String input) {
        int start = 0, end = input.length() - 1;
        boolean flag = false;
        while (start < end) {
            if (input.charAt(start) == input.charAt(end)) {
                flag = true;
            } else {
                return false;
            }
            start++;
            end--;
        }
        return flag;
    }

    public static void main(String... args) {
        String input = "racecar";
        System.out.println(validatePalindrome(input));
    }
}
