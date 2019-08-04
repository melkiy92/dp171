package com.softserve.elementary.task2;

import com.softserve.elementary.common.Dialog;
import com.softserve.elementary.common.MyScanner;

public class App2 {
    public static void main(String[] args) {
        double[] parameters;
        boolean repeat = true;
        do {
            parameters = ConsoleInteraction2.getEnvelopeSizes();
            Envelope envelope1 = new Envelope(parameters[0], parameters[1]);
            Envelope envelope2 = new Envelope(parameters[2], parameters[3]);
            EnvelopeComparator envComparator = new EnvelopeComparator();
            int result = envComparator.compare(envelope1, envelope2);
            ConsoleInteraction2.printResult(result);

            if (!Dialog.askToRepeat()) {
                Dialog.sayBye();
                MyScanner.getInstance().close();
                repeat = false;
            }
        } while (repeat);
        //MyScanner.getInstance().close();

    }
}
