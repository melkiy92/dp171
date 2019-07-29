package com.softserve.elementary.task3;

import com.softserve.elementary.common.userInteraction.Dialog;
import com.softserve.elementary.common.userInteraction.MyScanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Triangle> trianglesList = new ArrayList<Triangle>();
        //TriangleService triangleService = new TriangleService();
        boolean repeat;

        if (Dialog.askToRepeat()) {

            repeat = true;
        } else {
            Dialog.sayBye();
            Dialog3.sortTriangles(trianglesList);
            Dialog3.printTriangles(trianglesList);
            MyScanner.getInstance().close();
            repeat = false;
        }

    }
}
