package com.dk.leetCode;

public class Q_1684_CountTheNumberOfConsistentStrings {

    private static int countTheNumberOfConsistentStrings(String allowed, String... words) {
        int result = 0;
        boolean flag;
        for (String i : words) {
            flag = false;
            for (char j : i.toCharArray()) {
                if (!(allowed.contains(String.valueOf(j)))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                result++;
            }
        }
        return result;
    }

    public static void main(String... args) {
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        System.out.println(countTheNumberOfConsistentStrings(allowed, words));
    }
}
