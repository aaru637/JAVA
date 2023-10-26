package com.dk;

/**
 * SecondLargestElement
 */
public class SecondLargestElement {

    private static int secondLargestElement(int... arr) {
        int first = arr[0];
        for (int i = 1; i < arr.length; i++) {
            first = Math.max(first, arr[i]);
        }
        int second = (first == arr[0]) ? arr[1] : arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != first) {
                second = Math.max(second, arr[i]);
            }
        }
        return second;
    }

    public static void main(String... args) {
        int[] arr = { 12, 1, 7, 5, 3, 10 };
        System.out.println(secondLargestElement(arr));
    }
}