package com.dk.algoDaily;

public class Day2_FizzBuzz {

    private static String fizzBuzz(int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result += "fizzbuzz";
            } else if (i % 3 == 0) {
                result += "fizz";
            } else if (i % 5 == 0) {
                result += "buzz";
            } else {
                result += i;
            }
        }
        return result;
    }

    public static void main(String... args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }
}
