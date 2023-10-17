package com.dk.leetCode;

public class Q_2367_NumberOfArithmeticTriplets {

    private static int numberOfArithmeticTriplets(int dif, int... input) {
        int count = 0;
        for (int i = 0; i < input.length - 2; i++) {
            for (int j = i + 1; j < input.length - 1; j++) {
                if (i < j && (input[j] - input[i] == dif)) {
                    for (int k = j + 1; k < input.length; k++) {
                        if (j < k) {
                            if ((input[k] - input[j] == dif)) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    public static void main(String... args) {
        int input[] = { 4, 5, 6, 7, 8, 9 };
        System.out.println(numberOfArithmeticTriplets(2, input));
    }
}
