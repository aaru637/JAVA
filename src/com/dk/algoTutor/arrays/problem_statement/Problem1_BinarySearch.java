package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * Problem1_BinarySearch
 * 
 * Given an array of integers nums which is sorted in ascending order, and an
 * integer target, write a function to search target in nums. If target exists, then
 * return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [-1,0,3,5,9,12], target = 9
 * Output: 4
 * 
 */
public class Problem1_BinarySearch {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 6;
        int index = ProblemServiceMethods.binarySearch(nums, target);
        System.out.println(index);
    }
}