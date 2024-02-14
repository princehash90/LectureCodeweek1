package org.example.week3;

import static input.InputUtils.doubleInput;

public class milesToKM {
    public static void main(String[] args) {// this is the main method
        double miles = doubleInput("Enter a number a miles");// getting the input from the user
        double km= milestoKM(miles); // calling the method
        System.out.println(miles + " miles is equal to "+ km + "km");

    }
    private static double milestoKM(double miles) { // this is the method created to do conversion miles to km
        return miles * 1.6;// doing the maths to caculate km and returns the answer of km
    }
}
