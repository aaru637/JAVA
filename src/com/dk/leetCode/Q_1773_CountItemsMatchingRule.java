package com.dk.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q_1773_CountItemsMatchingRule {

    private static int selectType(String type) {
        switch (type) {
            case "type" -> {
                return 0;
            }

            case "color" -> {
                return 1;
            }

            case "name" -> {
                return 2;
            }

            default -> {
                return -1;
            }
        }
    }

    private static int countItemMatches(List<List<String>> outer, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < outer.size(); i++) {
            if (outer.get(i).get(selectType(ruleKey)).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String... args) {
        List<String> inner1 = new ArrayList<>(Arrays.asList("phone", "blue", "pixel"));
        List<String> inner2 = new ArrayList<>(Arrays.asList("computer", "silver", "lenovo"));
        List<String> inner3 = new ArrayList<>(Arrays.asList("phone", "gold", "iphone"));
        List<List<String>> outer = new ArrayList<>(Arrays.asList(inner1, inner2, inner3));
        System.out.println(countItemMatches(outer, "color", "silver"));
    }
}
