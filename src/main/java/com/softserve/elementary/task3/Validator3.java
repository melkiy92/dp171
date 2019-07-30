package com.softserve.elementary.task3;

import java.util.List;

public class Validator3 {
    //public static boolean invalidTriangleData;

    public static boolean isValidSize(List<String> argList) throws InvalidTriangleDataException {
        if (argList.size() != 4) {
            throw new InvalidTriangleDataException("You have entered invalid number of data for triangle\\'s creation.");
        }
        return true;
    }
        /*while (argList.size() != 4) {
            System.out.println("You have entered invalid number of data for triangle\'s creation. Please try again.");
            argList = convertToList(getTriangleDataFromConsole());
        }
        return true;*/


   // public static void isValidSides(List<String> argList) {



    public static boolean isValidTriangle(double[] sides)  throws InvalidTriangleDataException {
        if(! (sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] &&
                sides[1] + sides[2] > sides[0])) {
            throw new InvalidTriangleDataException("You have entered invalid lengths of triangles. The sum of the two sides should be greater than the third side.");
        }
        return true;

    }



}
