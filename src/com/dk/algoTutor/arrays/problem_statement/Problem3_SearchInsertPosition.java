package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * Problem3_SearchInsertPosition
 * 
 * Given a sorted array of distinct integers and a target value, return the index if
 * the target is found. If not, return the index where it would be if it were inserted
 * in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [1, 3, 4, 5], target = 2
 * Output: 1
 */
public class Problem3_SearchInsertPosition {

    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5};
        int target = 1;
        int index = ProblemServiceMethods.searchInsert(nums, target);
        System.out.println(index);
        
    }
}
