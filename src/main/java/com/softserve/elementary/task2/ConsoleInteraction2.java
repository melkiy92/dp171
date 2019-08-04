package com.softserve.elementary.task2;

import com.softserve.elementary.common.MyScanner;

import java.util.Scanner;

public class ConsoleInteraction2 {
    private static Scanner scanner = MyScanner.getInstance();

    public static double[] getEnvelopeSizes() {
        double number;
        double[] sizes = new double[4];
        char[] sides = {'a', 'b', 'c', 'd'};
        System.out.println("Please enter sides of two envelopes: (a,b) and (c,d).");
        for (int i = 0; i < 4; i++) {
            do {
                System.out.println("Enter the length of " + sides[i] + ": ");
                while (!scanner.hasNextDouble()) {
                    System.err.println("That is not a number. Please enter again.");
                    scanner.next();
                }
                number = scanner.nextDouble();
                if (number <= 0) {
                    System.err.println("The number should be positive. Please enter again.");
                }
            } while (number <= 0);
            sizes[i] = number;
        }
        return sizes;
    }

    public static void printResult(int i) {
        if (i == 1) {
            System.out.println("2nd envelope can be put into 1st envelope.");
        } else if (i == -1) {
            System.out.println("1st envelope can be put into 2nd envelope.");
        } else if (i == 0) {
            System.out.println("Sorry, you cannot put one envelope in another.");
        }

    }


}
