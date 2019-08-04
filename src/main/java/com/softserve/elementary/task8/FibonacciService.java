package com.softserve.elementary.task8;

import java.util.ArrayList;
import java.util.List;

public class FibonacciService {

    public static int convertToPositiveInt(String parameter) {
        int intParam = 0;
        try {
            intParam = Integer.parseInt(parameter);
        } catch (NumberFormatException e) {
            System.err.println("Invalid type specified as parameter: cannot be converted to integer.");
        }
        if(intParam <= 0) {
            throw new IllegalArgumentException("All numbers should be positive.");
        }
        return intParam;
    }

    public List<Long> getFibonacciSequenceByLength(long n) {
        List<Long> sequence = new ArrayList<Long>();
        long f1 = 1, f2 = 1;
        sequence.add(f1);
        sequence.add(f2);
        if(n <= 2) {
            return sequence;
        }
        long sum = 0;
        for(int i=3;i<=n;i++) {
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            sequence.add(sum);
        }
        return sequence;
    }


    public List<Long> getFibonacciSequenceByRange(long startPos, long endPos) {
        List<Long> sequence = new ArrayList<Long>();
        long f1 = 1, f2 = 1;
        long sum = 0;

        //for(int i=3;i<=endPos;i++) {
        while (f2 <= endPos){
            sum = f1 + f2;
            f1 = f2;
            f2 = sum;
            if(f2 >= startPos && f2 <= endPos) {
                sequence.add(f2);
            }
        }
        return sequence;
    }
}
