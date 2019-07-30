package com.softserve.elementary.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.softserve.elementary.task3.Converter.convertToDouble;

public class TriangleService {
    //private List<Triangle> trianglesList = new ArrayList<Triangle>();

    public Triangle createTriangle(List<String> argList) {
        String triangleName = argList.get(0);
        double[] sides = new double[3];
        double side = 0;
            for(int i =1; i < argList.size(); i++) {
                try {
                    side = convertToDouble(argList.get(i));
                } catch (InvalidTriangleDataException e) {
                    e.getMessage();
                }
                if(side > 0) {
                    sides[i-1] = side;
                }
            }
        Triangle triangle = new Triangle(triangleName, sides[0], sides[1], sides[2]);
        return triangle;
    }

    //return void?
    public double calculateArea(Triangle triangle) {

        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();
        double halfPerimeter = calculateHalfPerimeter(sideA, sideB, sideC);
        double areaOfTriangle = Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
        triangle.setArea(areaOfTriangle);
        return areaOfTriangle;
    }

    private double calculateHalfPerimeter(double sideA, double sideB, double sideC) {

        return (sideA + sideB + sideC) / 2;

    }

    public static void sortTriangles(List<Triangle> list) {

        Comparator<Triangle> comparator = new TriangleComparator();
        Collections.sort(list, comparator);
    }




   // triangle.setArea(triangleService.calculateArea(triangle));
    //trianglesList.add(triangle);
}
