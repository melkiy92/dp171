package com.softserve.elementary.task3;

import com.softserve.elementary.common.MyScanner;

import java.util.*;

public class ConsoleInteraction3 {
    private static Scanner scanner = MyScanner.getInstance();


    public static String getTriangleDataFromConsole() {
        System.out.println("Enter the data of triangle in the following format:");
        System.out.println("<name>, <length of sideA>, <length sideB>, <length of sideC> \n");
        String sTriangleData = scanner.nextLine();
        return sTriangleData;
    }

    public static boolean askToAddTriangle() {
        System.out.print("Do you want to add one more triangle to compare? Enter \"y\" or \"yes\" to continue: ");
        String answer = scanner.next().trim();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
    }


    public static void printTriangles(List<Triangle> list) {
        int count = 1;
        System.out.println("=============Triangles list:===============");
        for (Triangle triangle : list) {
            System.out.println(count + ". " + triangle.toString());
            count++;
        }

    }
}
