package com.dk;

/**
 * SecondLargestElement
 */
public class SecondLargestElement {

    private static int secondLargestElement(int... arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            if(first < arr[i]) {
                second = first;
                first = arr[i];
            }
            else if(arr[i] != first && second < arr[i]) {
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String... args) {
        int[] arr = { 12, 1, 7, 5, 3, 10, 13 };
        System.out.println(secondLargestElement(arr));
    }
}