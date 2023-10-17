package com.dk.leetCode;

public class Q_2535_DifferenceElementSumDigitSum {

    private static int sumOfAnArray(int... input) {
        int sum = 0;
        for(int i : input) {
            sum += i;
        }
        return sum;
    }

    private static int digitOfAnArray(int input) {
        if(input <= 0) {
            return input;
        }
        else {
            return (input % 10) + digitOfAnArray(input / 10);
        }
    }

    private static int differenceElementSumDigitSum(int... input) {
        int sumOfArray = sumOfAnArray(input);
        int digitOfAnArray = 0;
        for(int i : input) {
            digitOfAnArray += digitOfAnArray(i);
        }

        return Math.abs(sumOfArray - digitOfAnArray);
    }
    public static void main(String... args) {
        int[] input = {1, 15, 6, 3};
        System.out.println(differenceElementSumDigitSum(input));
    }
}
