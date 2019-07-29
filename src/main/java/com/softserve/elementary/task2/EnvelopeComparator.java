package com.softserve.elementary.task2;

import java.util.Comparator;

public class EnvelopeComparator implements Comparator<Envelope> {

    public int compare(Envelope env1, Envelope env2){
        if((env1.getMaxSide() > env2.getMaxSide()) && (env1.getMinSide() > env2.getMinSide())) {
            return 1;
        } else if((env1.getMaxSide() < env2.getMaxSide()) && (env1.getMinSide() < env2.getMinSide())) {
            return -1;
        } else {
            return 0;
        }
    }
}
