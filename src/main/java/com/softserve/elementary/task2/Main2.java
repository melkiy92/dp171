package com.softserve.elementary.task2;

import com.softserve.elementary.common.userInteraction.Dialog;
import com.softserve.elementary.common.userInteraction.MyScanner;

public class Main2 {
    public static void main(String[] args) {
        double[] parameters;
        boolean repeat = true;
        do {
            parameters = Dialog2.getEnvelopeSizes();
            Envelope envelope1 = new Envelope(parameters[0], parameters[1]);
            Envelope envelope2 = new Envelope(parameters[2], parameters[3]);
            EnvelopeComparator envComparator = new EnvelopeComparator();
            int result = envComparator.compare(envelope1, envelope2);
            Dialog2.printResult(result);

            if (!Dialog.askToRepeat()) {
                Dialog.sayBye();
                MyScanner.getInstance().close();
                repeat = false;
            }
        } while (repeat);


    }
}
