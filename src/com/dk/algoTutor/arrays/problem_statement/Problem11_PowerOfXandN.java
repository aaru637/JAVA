package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * Problem11_PowerOfXandN
 * 
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * Example 1:
 * Input: x = 2.00000, n = 10
 * Output: 1024.00000
 */
public class Problem11_PowerOfXandN {
    public static void main(String[] args) {
        float base = 3f;
        int exponent = 10;
        System.out.printf("%.6f\n", ProblemServiceMethods.power(base, exponent));
    }
}