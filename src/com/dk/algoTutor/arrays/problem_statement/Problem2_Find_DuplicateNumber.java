package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
  * Problem2_Find_DuplicateNumber
  *
  * Given an array of integers nums containing n + 1 integers where each integer
  * is in the range [1, n] inclusive.
  * There is only one repeated number in nums, return this repeated number.
  * constant extra space.
  * You must solve the problem without modifying the array nums and uses only
  * Example 1:
  * Input: nums = [1,3,4,2,2]
  * Output: 2
  *
  */
 public class Problem2_Find_DuplicateNumber {
 
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 5, 5, 5};
        int duplicate = ProblemServiceMethods.findDuplicate(nums);
        System.out.println(duplicate);
    }
 }
