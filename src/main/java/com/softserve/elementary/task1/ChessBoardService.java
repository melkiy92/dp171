package com.softserve.elementary.task1;


public class ChessBoardService {

    public void draw(ChessBoard chessBoard) {
        for (int i = 0; i < chessBoard.getHeight(); i++) {
            if (i % 2 == 1) {
                System.out.print(" ");
            }
            for (int j = 0; j < chessBoard.getWidth(); j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
