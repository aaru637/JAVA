package com.dk.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_2828_AcronymWordsOfString {

    private static boolean acronymWordsOfString(List<String> input, String s) {
        if(s.length() != input.size()) {
            return false;
        }
        for(int i = 0 ; i < input.size() ; i++) {
            if(!(input.get(i).startsWith(String.valueOf(s.charAt(i))))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String... args) {
        List<String> input = new ArrayList<>(Arrays.asList("alice", "bob", "charlie"));
        String s = "abc";
        System.out.println(acronymWordsOfString(input, s));
    }
}
