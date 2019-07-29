package com.softserve.elementary.common.userInteraction;

import java.util.Scanner;

public class Dialog {
    //private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //System.out.print("Enter email: ");
//String email = reader.readLine();
    private static Scanner scanner = MyScanner.getInstance();

    public static void chooseTask() {
        System.out.println("You may choose any program to run:\n" +
                "1. Chess Board.\n" +
                "2. Envelope Analysis.\n" +
                "3. Triangle sort. \n" +
                "4. Parser\n" +
                "5. Sequences(fibonacci/square)\n" +
                "6. Lucky tickets\n" +
                "7. Numbers\n" +
                "Please enter the number of task (from 1 to 9):");
    }


    public static boolean askToRepeat() {
        System.out.print("Do you want to repeat? Enter \"y\" or \"yes\" to continue: ");
        String answer = scanner.next().trim();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }

    public static void sayBye() {
        System.out.println("That's it. Bye.");
    }


}
