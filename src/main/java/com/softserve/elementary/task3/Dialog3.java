package com.softserve.elementary.task3;

import com.softserve.elementary.common.userInteraction.MyScanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dialog3 {
    private static Scanner scanner = MyScanner.getInstance();

    private List<Triangle> trianglesList = new ArrayList<Triangle>();
    private TriangleService triangleService = new TriangleService();


    public String getTriangleDataFromConsole() {
        System.out.println("Please enter the data of triangle in the following format:");
        System.out.println("<name>, <length of sideA>, <length sideB>, <length of sideC>");
        String triangleData = scanner.nextLine();
        return triangleData;
    }

       /* } catch (NumberFormatException ex) {
            System.out.println("You have inputted a wrong format for the parameter of triangle\'s side" +
                    " (look at the format above, please). Try again, please");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Not a correct inputting format (look at the format above, please)." +
                    " Try again, please");
        } catch (IOException ex) {
            System.out.println(ex);
        }*/



    private String[] workWithInputString(String trianglesData) {

        /*
           1. Zero or more whitespaces (\\s*)
           2. Arrow, or comma, or whitespace (=>|,|\\s)
           3. Zero or more whitespaces (\\s*)
         */
        String[] arrayTrianglesDate = trianglesData.split("\\s*(=>|,|\\s)\\s*");
        if (arrayTrianglesDate.length > 5) {
            System.out.println("It was inputted a lot of parameters. (look at the format above, please)." +
                    " Try again, please");
            return null;
        }
        return arrayTrianglesDate;
    }

    private void workWithTriangle(String[] arrayTrianglesDate) {
        String triangleName = arrayTrianglesDate[0] + " " + arrayTrianglesDate[1];
        double sideA = getTrianglesSide(arrayTrianglesDate[2]);
        double sideB = getTrianglesSide(arrayTrianglesDate[3]);
        double sideC = getTrianglesSide(arrayTrianglesDate[4]);
        Triangle triangle = new Triangle(sideA, sideB, sideC, triangleName);
        triangle.setArea(triangleService.calculateArea(triangle));
        trianglesList.add(triangle);
    }

    private double getTrianglesSide(String s) {

        double sideTriangle = Double.parseDouble(s);
        return sideTriangle;

    }

    private boolean exitAndGetResults(BufferedReader bufferedReader) throws IOException {
        System.out.println("\nDo you want to continue?");
        System.out.println("Enter please \"y\" or \"yes\" (you can ignore character case).");
        System.out.println("If you want to exit then type another else, please.");

        String exitOrNo = bufferedReader.readLine();
        boolean exitY = exitOrNo.equalsIgnoreCase("y");
        boolean exitYes = exitOrNo.equalsIgnoreCase("yes");
        if ((!exitY) && (!exitYes)) {
            sortTriangles(trianglesList);
            printTriangles(trianglesList);
            bufferedReader.close();
            return true;
        }
        return false;
    }

    public static void sortTriangles(List<Triangle> list) {

        Comparator<Triangle> comparator = new TriangleComparator();
        Collections.sort(list, comparator);

    }

    public static void printTriangles(List<Triangle> list) {

        int count = 1;
        System.out.println("============= Triangles list: ===============");
        for (Triangle triangle : list) {
            System.out.println(count + " " + triangle.toString());
            count++;
        }

    }
}
