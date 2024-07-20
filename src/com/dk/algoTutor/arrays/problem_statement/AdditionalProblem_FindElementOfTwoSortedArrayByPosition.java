package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * AdditionalProblem_FindElementOfTwoSortedArrayByPosition
 */
public class AdditionalProblem_FindElementOfTwoSortedArrayByPosition {
    public static void main(String[] args) {
        int[] first = { 2, 3, 6, 7, 9 };
        int[] second = { 1, 4, 8, 10 };
        System.out.println(ProblemServiceMethods.findKthElement(first, second, 0));
    }

}
