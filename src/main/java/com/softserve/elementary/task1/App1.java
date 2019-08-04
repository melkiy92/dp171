package com.softserve.elementary.task1;

import com.softserve.elementary.common.Dialog;

import java.util.Arrays;

public class App1 {

    public static String[] mainArguments;

    public static void main(String[] args) {

        mainArguments = args;
        int[] parameters = new int[2];

        if (mainArguments.length != 0) {
            parameters = Converter.convertToInt(mainArguments);
        }

        boolean repeat;
        do {
            if (parameters[0] <= 0 || parameters[1] <= 0) {
                parameters = ConsoleInteraction1.getSizesFromConsole();
            }
            ChessBoard board = new ChessBoard(parameters[0], parameters[1]);
            ChessBoardService chessBoardService = new ChessBoardService();
            chessBoardService.draw(board);

            if (Dialog.askToRepeat()) {
                Arrays.fill(parameters, 0);
                repeat = true;
            } else {
                Dialog.sayBye();
                repeat = false;
            }
        } while (repeat);
        //MyScanner.getInstance().close();
    }
}
