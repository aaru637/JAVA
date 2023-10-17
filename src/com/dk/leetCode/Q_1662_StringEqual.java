package com.dk.leetCode;

public class Q_1662_StringEqual {

    private static boolean stringEqual(String[] input1, String[] input2) {
        String temp1 = "";
        String temp2 = "";
        for(String i : input1) {
            temp1 += i;
        }
        for(String i : input2) {
            temp2 += i;
        }
        return temp1.equals(temp2);
    }
    public static void main(String... args) {
        String[] input1 = {"race", "car"};
        String[] input2 = {"rac", "ecar"};
        System.out.println(stringEqual(input1, input2));
    }
}
