package com.dk.algoTutor.arrays.problem_statement;

import com.dk.algoTutor.arrays.ProblemServiceMethods;

/**
 * Problem6_LengthOfLastWord
 * Given a string s consisting of words and spaces, return the length of the
 * last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * Example 1:
 * Input: s = "Hello World"
 * Output: 5
 */
public class Problem6_LengthOfLastWord {
    public static void main(String[] args) {
        String input = "HelloWorld";
        System.out.println(ProblemServiceMethods.findLengthLastWord(input));
    }
}