package com.softserve.elementary.task1;

import com.softserve.elementary.common.userInteraction.MyScanner;

import java.util.Scanner;

public class Dialog1 {

    private static Scanner scanner = MyScanner.getInstance();

    public static int[] getSizesFromConsole() {
        int number;
        int[] parameters = new int[2];
        String[] sides = {"height", "width"};
        for (int i = 0; i < 2; i++) {
            do {
                System.out.println("Please enter the " + sides[i] + " of chessboard:");
                while (!scanner.hasNextInt()) {
                    System.out.println("That is not a number. Please enter again.");
                    scanner.next();
                }
                number = scanner.nextInt();
                if( number <= 0 ) {
                    System.out.println("The number should be positive. Please enter again.");
                }
            } while (number <= 0);
            parameters[i] = number;
        }
        return parameters;
    }
}


