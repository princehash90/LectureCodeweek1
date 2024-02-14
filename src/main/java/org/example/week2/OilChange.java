package org.example.week2;

public class OilChange {
    public static void main(String[] args) {
        int mileage = 150000; // Always good practice to name variable instead of magical numbers
        int interval = 3000;
        for (int oilChange =0; oilChange<8; oilChange++){
            mileage= mileage+ interval;
            System.out.println("Get oil Change at " + mileage + "Miles");
            //prints loops 8 times

        }
    }
}
