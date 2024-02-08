package org.example.week2;

import java.text.NumberFormat;

import static input.InputUtils.intInput;

public class averageUtilityBill {
    public static void main(String[] args) {
        String[] months ={"January","February","March","April","May","June","July","August","September",
        "October","November","December"};
        int average = 0;
        final int numberOfMonths= 12;
        for (int x=0;x<months.length; x++){
            int userInput = intInput("How much did you pay in " + months[x]);
            average= average+ userInput;

        }
        double calculatedAverage = average/numberOfMonths;
        System.out.printf(" your average utility cost is $%.2f", calculatedAverage);
    }
}
