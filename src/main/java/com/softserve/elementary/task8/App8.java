package com.softserve.elementary.task8;

import com.softserve.elementary.task7.SequenceService;

import java.util.ArrayList;
import java.util.List;


public class App8 {
    public static String[] mainArguments;

    public static void main(String[] args) {
        mainArguments = args;
        int length = 0;
        int startPos = 0;
        int endPos = 0;
        FibonacciService fbService = new FibonacciService();

        if (mainArguments.length == 1) {
            length = FibonacciService.convertToPositiveInt(mainArguments[0]);
            System.out.println(fbService.getFibonacciSequenceByLength(length).toString());
        } else if (mainArguments.length == 2) {
            startPos = FibonacciService.convertToPositiveInt(mainArguments[0]);
            endPos = FibonacciService.convertToPositiveInt(mainArguments[1]);
            System.out.println(fbService.getFibonacciSequenceByRange(startPos, endPos).toString());
        } else {
            System.err.println("Invalid number of arguments: \n one argument specifies the length of fibonacci sequence, two arguments specify the range of sequence.");
        }

    }


}
