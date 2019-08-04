package com.softserve.elementary.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TriangleService {
    List<Triangle> trianglesList = new ArrayList<Triangle>();
    DataParser dataParser = new DataParser();


    public static void sortTriangles(List<Triangle> list) {

        Comparator<Triangle> comparator = new TriangleComparator();
        Collections.sort(list, comparator);
    }



}
