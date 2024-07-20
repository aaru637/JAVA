package com.dk.algoTutor.arrays.problem_statement;

import java.util.Arrays;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/*
 * Not understandable question..
 */
/**
 * Problem12_FindPeakElement
 * 
 * A peak element in a 2D grid is an element that is strictly greater than all
 * of its adjacent neighbors to the left, right, top, and bottom.
 * Given a 0-indexed m x n matrix mat where no two adjacent cells are equal,
 * find any peak element mat[i][j] and return the length 2 array [i,j].
 * You may assume that the entire matrix is surrounded by an outer perimeter
 * with the value -1 in each cell.
 * You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.
 * Example 1:
 * Input: mat = [[1,4],[3,2]]
 * Output: [0,1]
 */
public class Problem12_FindPeakElement {

    public static void main(String[] args) {
        int[][] input = { { 12, 15 }, { 14, 13 } };
        System.out.println(Arrays.toString(ProblemServiceMethods.findPeakElement(input)));
    }
}
