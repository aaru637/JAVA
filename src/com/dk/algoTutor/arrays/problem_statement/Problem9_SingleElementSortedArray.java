package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * Problem9_SingleElementSortedArray
 * You are given a sorted array consisting of only integers where every element
 * appears exactly twice, except for one element which appears exactly once.
 * Return the single element that appears only once.
 * Your solution must run in O(log n) time and O(1) space.
 * Example 1:
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 */
public class Problem9_SingleElementSortedArray {
    public static void main(String[] args) {
        int[] input = { 1, 1, 3, 3, 4, 4, 5, 5, 6, 6, 7 };
        System.out.println(ProblemServiceMethods.singleElementSortedArray(input));
    }
}
