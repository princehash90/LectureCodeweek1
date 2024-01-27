package org.example.Week1;

import static input.InputUtils.*;

public class milesconversion {
    public static void main(String[] args) {
        double distance =positiveDoubleInput("what is the distance btn your home and MCTC in miles?");
        double KmDistance = distance * 1.6;
        System.out.println("the distance of your home and MCTC in km is " + KmDistance);

    }
}
