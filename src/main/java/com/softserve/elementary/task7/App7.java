package com.softserve.elementary.task7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App7 {
    public static String[] mainArguments;

    public static void main(String[] args) {

        mainArguments = args;
        int limitNumber = 0;

        if (mainArguments.length == 1) {
            limitNumber = SequenceService.convertToInt(mainArguments);
        } else {
            System.err.println("Only one argument could be passed.");
        }

        if (limitNumber <= 0) {
            limitNumber = ConsoleInteraction7.getLimitNumber();
        }

        double limitNumberSquared = Math.sqrt(limitNumber);
        String sequence = Stream.iterate(1, n -> n + 1).limit((int) limitNumberSquared).map( n -> n.toString() ).collect(Collectors.joining(","));

        System.out.println("Here is a series of natural numbers whose square is less than a specified number:");
        System.out.println(sequence);


    }
}
