package com.dk.algoDaily;

public class Day11_SumDigitsUntilOne {

    private static int sumDigitsUntilOne(int n) {
        if (String.valueOf(n).length() == 1) {
            return n;
        } else {
            return sumDigitsUntilOne((n % 10) + (n / 10));
        }
    }

    public static void main(String... args) {
        int n = 493;
        System.out.println(sumDigitsUntilOne(n));
    }
}
