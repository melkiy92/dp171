package com.softserve.elementary.task1;

public class ChessBoard {

    private int height;
    private int width;

    public ChessBoard(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "ChessBoard{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

}



