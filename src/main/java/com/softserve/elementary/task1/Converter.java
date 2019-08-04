package com.softserve.elementary.task1;

public class Converter {

    public static int[] convertToInt(String[] parameters) {
        int[] intParams = new int[parameters.length];
        int intParam = 0;
        int i = 0;
        for (String param : parameters) {
            try {
                intParam = Integer.parseInt(param);
            } catch (NumberFormatException e) {
                System.out.println("Invalid type specified as parameter: cannot be converted to integer.");
                intParam = 0;
            }
            intParams[i] = intParam;
            i++;
        }
        return intParams;
    }

}
