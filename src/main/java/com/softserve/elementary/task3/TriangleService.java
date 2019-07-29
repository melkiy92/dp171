package com.softserve.elementary.task3;

public class TriangleService {

    public double calculateArea(Triangle triangle) {

        double sideA = triangle.getSideA();
        double sideB = triangle.getSideB();
        double sideC = triangle.getSideC();
        double halfPerimeter = calculateHalfPerimeter(sideA, sideB, sideC);
        double areaOfTriangle = Math.sqrt(halfPerimeter
                * (halfPerimeter - sideA)
                * (halfPerimeter - sideB)
                * (halfPerimeter - sideC));
        return areaOfTriangle;

    }

    private double calculateHalfPerimeter(double sideA, double sideB, double sideC) {

        return (sideA + sideB + sideC) / 2;

    }
}
