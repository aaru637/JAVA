package com.dk.algoTutor.arrays.problem_statement;

import java.util.Arrays;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * Problem4_SortColors
 * 
 * Given an array nums with n objects colored red, white, or blue, sort them in-
 * place so that objects of the same color are adjacent, with the colors in the
 * order red, white, and blue.
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue,
 * respectively.
 * You must solve this problem without using the library's sort function.
 * Example 1:
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * 
 */
public class Problem4_SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        ProblemServiceMethods.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }    
}
