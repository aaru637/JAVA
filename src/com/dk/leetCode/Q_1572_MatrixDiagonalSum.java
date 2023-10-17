package com.dk.leetCode;

public class Q_1572_MatrixDiagonalSum {

    private static int matrixDiagonalSum(int[][] input) {
        int sum = 0;
        int row = input.length;
        int col = input[0].length;
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < col ; j++) {
                if((i == j) || (Math.abs(j - i) == col - i - 1)) {
                    sum += input[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String... args) {
        int[][] input = {{1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1},{1, 1, 1, 1}};
        System.out.println(matrixDiagonalSum(input));
    }
}
