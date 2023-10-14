package com.dk.algoDaily;

public class Day18_SumOfAllPrimes {
    private static boolean findPrime(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int sumAllPrimes(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (findPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String... args) {
        int n = 7;
        System.out.println(sumAllPrimes(n));
    }
}
