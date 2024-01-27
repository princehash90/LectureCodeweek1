package org.example.Week1;

import static input.InputUtils.doubleInput;

public class AbovrFreezing {
    public static void main(String[] args) {
        System.out.println("Enter today's temperature in F");
        double temp = doubleInput();
        if ( temp>32) {
            // this will run if the condition is true
            System.out.println("It is Freezing");
        }else {
            System.out.println("It is Below Freezing");
        }
    }
}
