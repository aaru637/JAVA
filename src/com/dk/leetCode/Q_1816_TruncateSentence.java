package com.dk.leetCode;

public class Q_1816_TruncateSentence {

    private static String truncateSentence(String input, int k) {
        String[] temp = input.split(" ");
        String result = "";
        for(int i = 0 ; i < k ; i++) {
            result += temp[i] + ((i == k - 1) ? "" : " ");
        }
        return result;
    }
    public static void main(String... args) {
        String input = "Hello How are you Contestant";
        System.out.println(truncateSentence(input, 4));
    }
}
