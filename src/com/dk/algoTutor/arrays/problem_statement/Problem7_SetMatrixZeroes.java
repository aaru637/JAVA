package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;
import java.util.Arrays;

/**
 * Problem7_SetMatrixZeroes
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row
 * and column to 0's.
 * You must do it in place.
 * Example 1:
 * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: [[1,0,1],[0,0,0],[1,0,1]]
 */
public class Problem7_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] input = { { 1, 1, 1 }, { 1, 0, 1 }, { 0, 1, 1 } };
        ProblemServiceMethods.setMatrixZones(input);
        System.out.println(Arrays.deepToString(input));
    }
}