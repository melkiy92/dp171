package com.softserve.elementary.task3;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)

public class TriangleTest {
    private double valueA;
    private double valueB;
    private double valueC;
    private double expectedArea;

    public TriangleTest(double valueA, double valueB, double valueC, double expectedArea) {
        this.valueA = valueA;
        this.valueB = valueB;
        this.valueC = valueC;
        this.expectedArea = expectedArea;
    }

    @Parameterized.Parameters(name = "{index}. Area of triangle ({0}, {1}, {2}) is {3}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {4, 5, 6, 9.9215},
                {8.8, 4.2, 4.8, 4.1412},
                {23, 4, 19.1, 9.3125},
                {12, 12, 12, 62.3538},
                {1, 2, 2, 0.9682},
                {250, 200, 100, 9499.1775}
        });
    }

    @Test
    public void testCalculateArea() {
        String name = "test";
        Triangle triangle = new Triangle(name, valueA, valueB, valueC);
        assertEquals(expectedArea, triangle.calculateArea(), 0.0001);
    }

}
