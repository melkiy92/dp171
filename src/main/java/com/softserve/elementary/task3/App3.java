package com.softserve.elementary.task3;

import java.util.ArrayList;
import java.util.List;

import static com.softserve.elementary.task3.ConsoleInteraction3.*;
import static com.softserve.elementary.task3.TriangleService.sortTriangles;

public class App3 {
    public static void main(String[] args) {

        //  TriangleService triangleService = new TriangleService();
        List<Triangle> trianglesList = new ArrayList<Triangle>();
        boolean repeat = false;
        do {
            String inputData = getTriangleDataFromConsole();
            DataParser dataParser = new DataParser();
            boolean isValidInput = false;
            try {
                isValidInput = dataParser.processUserData(inputData);
            } catch (InvalidTriangleDataException e) {
                System.err.println(e);
            }
            if (isValidInput) {
                Triangle triangle = new Triangle(dataParser.getParsedName(), dataParser.getParsedSides()[0], dataParser.getParsedSides()[1], dataParser.getParsedSides()[2]);
                triangle.calculateArea(triangle);
                trianglesList.add(triangle);
            }
            //when no triangles sre in list, only heading is printing to console
            if (!askToAddTriangle()) {
                sortTriangles(trianglesList);
                printTriangles(trianglesList);
                repeat = false;
            } else {
                repeat = true;
            }
        } while (repeat);
        //MyScanner.getInstance().close();
    }
}
