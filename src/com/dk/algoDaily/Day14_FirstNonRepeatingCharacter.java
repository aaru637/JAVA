package com.dk.algoDaily;

public class Day14_FirstNonRepeatingCharacter {

    private static char firstNonRepeatingCharacter(String input) {
        String temp = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            if (temp.contains(String.valueOf(input.charAt(i)))) {
                temp.replace(String.valueOf(input.charAt(i)), "");
            } else {
                temp += input.charAt(i);
            }
        }
        return temp.charAt(temp.length() - 1);
    }

    public static void main(String... args) {
        String input = "asdfsdafdasfjdfsafnnul";
        System.out.println(firstNonRepeatingCharacter(input));
    }
}
