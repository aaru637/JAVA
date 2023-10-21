package com.dk.leetCode;

public class Q_1732_FindTheHighestAltitude {

    private static int findTheHighestAltitude(int... gain) {
        int altitude = 0;
        int highPoint = altitude;
        for (int i : gain) {
            altitude += i;
            highPoint = Math.max(altitude, highPoint);
        }
        return highPoint;
    }

    public static void main(String... args) {
        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println(findTheHighestAltitude(gain));
    }
}
