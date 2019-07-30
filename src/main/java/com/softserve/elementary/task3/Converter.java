package com.softserve.elementary.task3;

import com.softserve.elementary.common.userInteraction.MyScanner;

import java.util.*;
import java.util.stream.Collectors;

public class Converter {

    public static List<String> argList = new ArrayList<String>();

/*

    Map<String, T> map = argList.stream().collect(Collectors.toMap(Object::getKey, item -> item));

    public <T> Map<String, T> convertToMap(Collection<T> list) {
        Map<String, T> map = new HashMap<String, T>();
        for (T el : list) {
            map.put(el.toString(), el);
        }
        return map;
    }
*/

    public static List<String> convertToList(String inputString) {
        // List<String> argList = new ArrayList<String>(Arrays.asList(inputString.split(",")));
        argList = Arrays.asList(inputString.split(","));
        for (String arg : argList) {
            System.out.println(arg);
            arg = arg.trim().toLowerCase();
            System.out.println(arg);
        }
        return argList;
    }



    public static double convertToDouble(String sArg) throws InvalidTriangleDataException {
       // double[] sides = new double[3];
        double dArg = 0;
        try {
            dArg = Double.parseDouble(sArg);
        } catch (NumberFormatException e) {
            throw new InvalidTriangleDataException("The length of the triangle\'s sides must be entered in double format. Please try again.");
        }
        return dArg;
    }


}
