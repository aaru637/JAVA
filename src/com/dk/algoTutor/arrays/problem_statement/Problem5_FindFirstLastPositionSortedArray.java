package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * Problem5_FindFirstLastPositionSortedArray
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the
 * starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */
public class Problem5_FindFirstLastPositionSortedArray {

    public static void main(String[] args) {
        int[] arr = { 1, 1, 3, 8, 8 };
        int target = 0;
        int[] result = ProblemServiceMethods.findFirstLastPosition(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
