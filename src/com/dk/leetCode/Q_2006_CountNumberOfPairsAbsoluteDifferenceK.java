package com.dk.leetCode;

public class Q_2006_CountNumberOfPairsAbsoluteDifferenceK {

    private static int countNumberOfPairsAbsoluteDifferenceK(int dif, int... input) {
        int count = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (Math.abs(input[i] - input[j]) == dif) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String... args) {
        int[] input = { 1, 2, 2, 1 };
        System.out.println(countNumberOfPairsAbsoluteDifferenceK(1, input));
    }
}
