package com.softserve.elementary.task1;

import com.softserve.elementary.common.*;
import com.softserve.elementary.common.userInteraction.Dialog;
import com.softserve.elementary.common.userInteraction.MyScanner;

import java.util.Arrays;

public class Main1 {

    public static String[] mainArguments;

    public static void main(String[] args) {

        mainArguments = args;
        int[] parameters = {};

        if (mainArguments.length != 0) {
            parameters = Converter.convertToInt(mainArguments);
        }

        boolean repeat;
        do {
            if (parameters[0] <= 0 || parameters[1] <= 0) {
                parameters = Dialog1.getSizesFromConsole();
            }
            ChessBoard board = new ChessBoard(parameters[0], parameters[1]);
            ChessBoardService chessBoardService = new ChessBoardService();
            chessBoardService.draw(board);

            if (Dialog.askToRepeat()) {
                Arrays.fill(parameters, 0);
                repeat = true;
            } else {
                Dialog.sayBye();
                MyScanner.getInstance().close();
                repeat = false;
            }
        } while (repeat);

    }
}
