package com.dk.leetCode;

public class Q_1588_SumOfAllOddLengthSubArray {

    private static int arraySum(int limit, int... input) {
        int sum = 0;
        for(int i = 0 ; i < (input.length - limit) + 1 ; i++) {
            sum += sum(i, i+limit, input);
        }
        return sum;
    }

    private static int sum(int start, int end, int... input) {
        int sum = 0;
        for(int i = start ; i < end ; i++) {
            sum += input[i];
        }
        return sum;
    }

    private static int sumOfAllOddLengthSubArray(int... input) {
        int sum = 0, k = 1;
        int exceedLength = (input.length % 2 == 0) ? input.length / 2 : (input.length / 2) + 1;
        for(int i = 0 ; i < exceedLength ; i++) {
            sum += arraySum(k, input);
            k += 2;
        }
        return sum;
    }

    public static void main(String... args) {
        int input[] = { 10, 11, 12 };
        System.out.println(sumOfAllOddLengthSubArray(input));
    }
}
