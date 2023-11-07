package com.dk;

/**
 * ReverseString
 */
public class ReverseString {

    private static String reverse(String result) {
        if (result.length() == 1) {
            return result;
        } else {
            return result.substring(result.length() - 1) + reverse(result.substring(0, result.length() - 1));
        }
    }

    public static void main(String... args) {
        System.out.println(reverse("one two three four five six seven eight nine ten"));
    }
}