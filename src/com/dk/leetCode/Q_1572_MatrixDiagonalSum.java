package com.dk.leetCode;

public class Q_1572_MatrixDiagonalSum {

    private static int matrixDiagonalSum(int[][] input) {
        int sum = 0, row = input.length, c = input[0].length - 1;
        for (int i = 0; i < row; i++) {
            if (i == c) {
                sum += input[i][c];
            } else {
                sum += (input[i][i] + input[i][c]);
            }
            c--;
        }
        return sum;
    }

    public static void main(String... args) {
        int[][] input = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(matrixDiagonalSum(input));
    }
}
