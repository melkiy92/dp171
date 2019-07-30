package com.softserve.elementary.task3;

import com.softserve.elementary.common.userInteraction.Dialog;
import com.softserve.elementary.common.userInteraction.MyScanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.softserve.elementary.task3.Converter.argList;
import static com.softserve.elementary.task3.Converter.convertToList;
import static com.softserve.elementary.task3.Dialog3.getTriangleDataFromConsole;

public class Main3 {
    public static void main(String[] args) {

      /*
        boolean repeat;
        do {
            String triangleData = getTriangleDataFromConsole();
            argList = convertToList(triangleData);
        } while (!Validator3.isValidSize(argList));

       // Triangle t = createTriangle(argList);
        System.out.println(t.toString());



 List<Triangle> trianglesList = new ArrayList<Triangle>();
        //TriangleService triangleService = new TriangleService();
        boolean repeat;

        if (Dialog.askToRepeat()) {

            repeat = true;
        } else {
            Dialog.sayBye();
            Dialog3.sortTriangles(trianglesList);
            Dialog3.printTriangles(trianglesList);
            MyScanner.getInstance().close();
            repeat = false;
        }

    }*/


    }
/*
    public static Scanner scanner = MyScanner.getInstance();
    public static List<String> argList = new ArrayList<String>();

    public static String getTriangleDataFromConsole() {
        System.out.println("Enter the data of triangle in the following format:");
        System.out.println("<name>, <length of sideA>, <length sideB>, <length of sideC> \n");
        String sTriangleData = scanner.nextLine();
        return sTriangleData;
    }

    public static List<String> convertToList(String inputString) {
       // List<String> argList = new ArrayList<String>(Arrays.asList(inputString.split(",")));
        argList = Arrays.asList(inputString.split(","));
        for (String arg : argList) {
            System.out.println(arg);
            arg = arg.trim().toLowerCase();
            System.out.println(arg);
        }
        return argList;
    }

    public static boolean isValidSize(List<String> argList) {
        while (argList.size() != 4) {
            System.out.println("You have entered invalid number of data for triangle\'s creation. Please try again.");
            argList = convertToList(getTriangleDataFromConsole());
        }
        return true;
    }

    public static double[] convertToDouble(List<String> argList1) {
        double[] abc = new double[3];

        try {
            for (int i = 0; i < 3; i++) {
                abc[i] = Double.parseDouble(argList1.get(i + 1));
            }
        } catch (NumberFormatException e) {
            System.out.println("The length of the triangle\'s sides must be entered in double format. Please try again.");
        }
        return abc;
    }

    public static Triangle createTriangle(List<String> argList) {
        String triangleName = argList.get(0);
        double[] sides = convertToDouble(argList);
        Triangle triangle;
        if (Validator3.isValidTriangle(sides)) {
            triangle = new Triangle(triangleName, sides[0], sides[1], sides[2]);
        }
        return triangle;
    }


    //triangle.setArea(triangleService.calculateArea(triangle));
    // trianglesList.add(triangle);
    */


}
