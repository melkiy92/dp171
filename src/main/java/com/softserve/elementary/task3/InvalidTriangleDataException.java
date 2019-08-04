package com.softserve.elementary.task3;

public class InvalidTriangleDataException extends Exception {

    public static void setInvalidDataFlag(boolean invalidDataFlag) {
    }

    public InvalidTriangleDataException() {
    }

    public InvalidTriangleDataException(String message) {
        super(message);
    }

    public InvalidTriangleDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidTriangleDataException(Throwable cause) {
        super(cause);
    }

    public InvalidTriangleDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
