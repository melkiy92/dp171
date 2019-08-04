package com.softserve.elementary.task7;

import com.softserve.elementary.common.MyScanner;

import java.util.Scanner;

public class ConsoleInteraction7 {
    private static Scanner scanner = MyScanner.getInstance();

    public static int getLimitNumber() {
        int number;
            do {
                System.out.println("Please enter the limit number: ");
                while (!scanner.hasNextInt()) {
                    System.err.println("That is not a number. Please enter again.");
                    scanner.next();
                }
                number = scanner.nextInt();
                if( number <= 0 ) {
                    System.err.println("The number should be positive. Please enter again.");
                }
            } while (number <= 0);
        return number;
    }
}
