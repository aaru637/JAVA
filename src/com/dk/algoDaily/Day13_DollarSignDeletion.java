package com.dk.algoDaily;

public class Day13_DollarSignDeletion {

    private static boolean innerCondition(int i, String... input) {
        if (input[i + 1].contains("$")) {
            if (input[i + 1].substring(input[i + 1].indexOf('$') + 1)
                    .equals(input[i].substring(input[i].indexOf('$') + 1))) {
                return true;
            } else {
                return false;
            }
        } else {
            if (input[i + 1]
                    .equals(input[i].substring(input[i].indexOf('$') + 1))) {
                return true;
            } else {
                return false;
            }
        }
    }

    private static boolean dollarSignDeletion(String... input) {
        boolean flag = false;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i].contains("$")) {
                flag = innerCondition(i, input);
                if (!flag)
                    return false;
            } else {
                flag = innerCondition(i, input);
                if (!flag)
                    return false;
            }
        }
        return flag;
    }

    public static void main(String... args) {
        String[] input = { "f$ast", "d$ast", "a$ast" };
        System.out.println(dollarSignDeletion(input));
    }
}