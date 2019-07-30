package com.softserve.elementary.task3;

import com.softserve.elementary.common.userInteraction.MyScanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Dialog3 {
    private static Scanner scanner = MyScanner.getInstance();

   // private List<Triangle> trianglesList = new ArrayList<Triangle>();
   // private TriangleService triangleService = new TriangleService();


    public static String getTriangleDataFromConsole() {
        System.out.println("Enter the data of triangle in the following format:");
        System.out.println("<name>, <length of sideA>, <length sideB>, <length of sideC> \n");
        String sTriangleData = scanner.nextLine();
        return sTriangleData;
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
