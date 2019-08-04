package com.softserve.elementary.task7;

public class SequenceService {
    public static int convertToInt(String[] parameters) {
        int intParam = 0;
            try {
                intParam = Integer.parseInt(parameters[0]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid type specified as parameter: cannot be converted to integer.");
            }
        return intParam;
    }
}
