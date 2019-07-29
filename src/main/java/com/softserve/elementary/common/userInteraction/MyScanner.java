package com.softserve.elementary.common.userInteraction;

import java.util.Scanner;

public class MyScanner {

    private static Scanner scanner;

    private MyScanner() {
    }

    public static Scanner getInstance() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }

        return scanner;
    }


}
