package com.dk.leetCode;

import java.util.HashMap;
import java.util.Map;

public class Q_804_UniqueMorseCodeWords {

    private static final String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    private static int countUniqueMorseCodeWords(String... input) {
        Map<String, Integer> rMap = new HashMap<>();
        for(int i = 0 ; i < input.length ; i++) {
            String temp = "";
            for(int j = 0 ; j < input[i].length() ; j++) {
                temp += morseCode[((int)(input[i].charAt(j)) - (int)'a')];
            }
            if(rMap.get(temp) == null) {
                rMap.put(temp, 1);
            }
        }
        return rMap.size();

    }
    public static void main(String... args) {
        String[] input = {"gin", "zen", "gig", "msg"};
        System.out.println(countUniqueMorseCodeWords(input));
    }
}
