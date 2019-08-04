package com.softserve.elementary.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {

    private boolean isValidData;
    private String parsedName;
    private double[] parsedSides;



    public boolean isValidData() {
        return isValidData;
    }
    public String getParsedName() {
        return parsedName;
    }
    public double[] getParsedSides() {
        return parsedSides;
    }

    private List<String> convertToList(String stringToParse) {
        List<String> argList = Arrays.asList(stringToParse.split(","));
        for (String arg : argList) {
            arg = arg.trim();
        }
        return argList;
    }

    private boolean checkSize(List<String> argList) throws InvalidTriangleDataException {
        if (argList.size() != 4) {
            isValidData = false;
            throw new InvalidTriangleDataException("You have entered invalid number of data for triangle\'s creation.");
        }
        return true;
    }


    private double parseSide(String sArg) throws NumberFormatException, InvalidTriangleDataException {
        double dArg = 0;
        try {
            dArg = Double.parseDouble(sArg);
        } catch (NumberFormatException e) {
            throw new InvalidTriangleDataException("The length of the triangle\'s sides must be entered in double format. Please try again.");
        }
        return dArg;
    }


    private double[] parseSides(List<String> argList) throws InvalidTriangleDataException {
        double[] sides = new double[3];
        for(int i =1; i < argList.size(); i++) {
            try {
                sides[i-1] = parseSide(argList.get(i));
            } catch (InvalidTriangleDataException e) {
                isValidData = false;
                e.printStackTrace();
            }
        }
        isValidData = true;
        return sides;
    }

    private boolean isPositiveSides(double[] sides) throws InvalidTriangleDataException {
        for (double number : sides) {
            if (number <= 0) {
                isValidData = false;
                throw new InvalidTriangleDataException("All sides should be positive.");
            }
        }
        return true;
    }

    private boolean checkSides(double[] sides) throws InvalidTriangleDataException {
        if (!(sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] &&
                sides[1] + sides[2] > sides[0])) {
            isValidData = false;
            throw new InvalidTriangleDataException("You have entered invalid lengths of triangles. The sum of the two sides should be greater than the third side.");
        }
        return true;
    }



    public boolean processUserData(String stringToParse) throws InvalidTriangleDataException{
        List<String> argList = convertToList(stringToParse);
            if (!checkSize(argList)) {
                return false;
            }
            parsedName = argList.get(0).toLowerCase();
            parsedSides = parseSides(argList);
            if (!isValidData || !isPositiveSides(parsedSides) || !checkSides(parsedSides)) {
                return false;
            }
        return true;
    }


}
