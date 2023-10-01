package com.dk.algoDaily;

public class Day7_PowerOfThree {

    private static int powerOfThree(int n) {
        if (n == 1) {
            return 1;
        } else if (n % 3 != 0) {
            return 0;
        } else {
            return powerOfThree(n / 3);
        }
    }

    public static void main(String... args) {
        int input = 27;
        System.out.println(powerOfThree(input) == 1 ? true : false);
    }
}
