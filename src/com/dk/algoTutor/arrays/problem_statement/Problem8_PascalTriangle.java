package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;
import java.util.Arrays;

/**
 * Problem8_PascalTriangle
 * 
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it as shown:
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class Problem8_PascalTriangle {
    public static void main(String[] args) {
        int row = 5;
        System.out.println(Arrays.deepToString(ProblemServiceMethods.pascalTriangle(row)));
    }

}