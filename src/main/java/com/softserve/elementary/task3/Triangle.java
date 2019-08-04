package com.softserve.elementary.task3;

import java.text.DecimalFormat;

public class Triangle {

    private String name;
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;

    public Triangle(String name, double sideA, double sideB, double sideC) {
     //   if(name.isEmpty() || name == null ) {     }
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

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
    @Override
    public String toString() {
        return "[Triangel " + name + "]: " + new DecimalFormat("#0.00").format(area) + " cm";
    }

}
