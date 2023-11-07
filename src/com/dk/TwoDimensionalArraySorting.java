package com.dk;

import java.util.Arrays;

/**
 * TwoDimensionalArraySorting
 */
public class TwoDimensionalArraySorting {

    private static void twoDimensionalArraySorting(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 1; i < col; i++) {
            for (int l = 0; l < col - i; l++) {
                if (arr[0][l] > arr[0][l + 1]) {
                    for (int j = l; j < l + 1; j++) {
                        for (int k = 0; k < row; k++) {
                            int temp = arr[k][j];
                            arr[k][j] = arr[k][j + 1];
                            arr[k][j + 1] = temp;
                        }
                    }
                }
            }
        }
    }

    public static void main(String... args) {
        int[][] arr = { { 3, 4, 1, 2 }, { 1234, 5678, 1010, 7465 }, { 1010, 4, 2, 123 } };
        twoDimensionalArraySorting(arr);
        System.out.println(Arrays.deepToString(arr));
    }
}