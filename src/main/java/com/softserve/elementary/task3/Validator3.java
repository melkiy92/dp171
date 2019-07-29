package com.softserve.elementary.task3;

public class Validator3 {
    private static boolean isValidTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB > sideC && sideA + sideC > sideB &&
                sideB + sideC > sideA;
    }
}
