package org.paf;

import java.util.ArrayList;

import static org.paf.Checks.*;

public class Paf {
    public static void main(String[] args) {

        ArrayList<String> names = namesJuniors(30);
        Float average = averageAge();
        ArrayList<String> namesW = namesWealthy();

        System.out.println();
    }
}