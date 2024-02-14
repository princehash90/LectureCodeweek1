package org.example.week3;

import static input.InputUtils.doubleInput;


public class MpgCalculator {
    public static void main(String[] args) {
        System.out.println("This program will calculate your car's fuel efficiency"); // oppening statement
        double milesDriven= doubleInput("Enter the number of miles drivern");// getting the number of miles
        double numberOfGallon= doubleInput("Enter the number of gallons used");// getting the number of gallons
        double fuelEfficiency=  fuel(milesDriven, numberOfGallon);// calling the method
        System.out.println("Your vehicle fuel efficiency is "+ fuelEfficiency + " per gallon");// printing the fuel efficiency
    }
    public static double fuel(double miles ,double gallons){// method with a parameter
        double fuelByGallons = miles /gallons;// calculates the miles divided my gallons
        return  fuelByGallons;// returns the result.
    }
}
