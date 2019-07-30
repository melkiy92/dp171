package com.softserve.elementary.task3;

public class InvalidTriangleDataException extends Exception {
    private static boolean invalidTriangleData;

    public static boolean isInvalidTriangleData() {
        return invalidTriangleData;
    }

   /* public static void setInvalidTriangleData(boolean invalidTriangleData) {
        InvalidTriangleDataException.invalidTriangleData = invalidTriangleData;
    }*/

    public InvalidTriangleDataException() {
        invalidTriangleData = true;
    }

    public InvalidTriangleDataException(String message) {
        super(message);
        invalidTriangleData = true;
    }

    public InvalidTriangleDataException(String message, Throwable cause) {
        super(message, cause);
        invalidTriangleData = true;
    }

    public InvalidTriangleDataException(Throwable cause) {
        super(cause);
        invalidTriangleData = true;
    }

    public InvalidTriangleDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        invalidTriangleData = true;
    }
}
