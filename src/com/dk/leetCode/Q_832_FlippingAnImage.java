package com.dk.leetCode;

import java.util.Arrays;

public class Q_832_FlippingAnImage {

    private static int inverse(int value) {
        return (value == 0) ? 1 : 0;
    }

    private static int[][] flippingAnImage(int[][] image) {
        int row = image.length, col = image[0].length, temp = 0;
        for (int i = 0; i < row; i++) {
            int start = 0, end = col - 1;
            while (start < end) {
                temp = inverse(image[i][start]);
                image[i][start] = inverse(image[i][end]);
                image[i][end] = temp;
                start++;
                end--;
            }
            if (start == end) {
                image[i][start] = inverse(image[i][start]);
            }
        }
        return image;
    }

    public static void main(String... args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        System.out.println(Arrays.deepToString(flippingAnImage(image)));
    }
}
