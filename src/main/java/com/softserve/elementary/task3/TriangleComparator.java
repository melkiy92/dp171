package com.softserve.elementary.task3;

import java.util.Comparator;

public class TriangleComparator implements Comparator<Triangle> {

    public int compare(Triangle triangle1, Triangle triangle2) {

        if (triangle1.getArea() > triangle2.getArea()) return -1;
        if (triangle1.getArea() < triangle2.getArea()) return 1;
        return 0;

    }
}
