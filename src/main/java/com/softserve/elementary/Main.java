package com.softserve.elementary;

import com.softserve.elementary.common.TaskController;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskController tr = new TaskController(new Scanner(System.in));
        tr.start();
    }
}
