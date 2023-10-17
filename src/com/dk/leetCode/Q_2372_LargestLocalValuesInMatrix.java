package com.dk.leetCode;

import java.util.Arrays;

public class Q_2372_LargestLocalValuesInMatrix {

    private static int threeXthreeMatrixLargeNumber(int startRow, int startColumn, int[][] input) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                max = Math.max(max, input[i + startRow][j + startColumn]);
            }
        }
        return max;
    }

    private static int[][] largestLocalValueMatrix(int[][] input) {
        int row = input.length;
        int col = input[0].length;
        int[][] result = new int[row - 2][col - 2];
        for (int i = 0; i < (row - 2); i++) {
            for (int j = 0; j < (col - 2); j++) {
                result[i][j] = threeXthreeMatrixLargeNumber(i, j, input);
            }
        }
        return result;
    }

    public static void main(String... args) {
        int[][] input = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 2, 1, 1 }, { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };
        int[][] result = largestLocalValueMatrix(input);
        System.out.println(Arrays.deepToString(result));
    }
}
