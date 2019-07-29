package com.softserve.elementary.common;

import com.softserve.elementary.common.userInteraction.Dialog;
import com.softserve.elementary.task1.Main1;
import com.softserve.elementary.task2.Envelope;

import java.util.Scanner;

public class TaskController {
    Scanner scanner;

    public TaskController(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        /*do {*/
        Dialog.chooseTask();
        int task = scanner.nextInt();
        switch (task) {
            case 1:
                Main1.main(new String[2]);
                //ChessBoardService chessBoardService = new ChessBoardService();
                //chessBoardService.start(new ConsoleInput());
                break;
            case 2:
                // Envelope envelope = new Envelope();
                //envelope.start();
                break;
            default:
                System.out.println("Invalid numbers inserted.");
        }
           /* if (GeneralFunction.askToRepeat()) {
                continue;
            } else {
                break;
            }
        } while (true);
*/
        System.out.println("That's it. Bye.");
    }

}
