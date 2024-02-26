package org.example.week4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class internetSpeed {
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();// created a list
        int totalHours = 12; // initializing the number of hrs to 12
        for (int hour = 0; hour < totalHours; hour++) {// classic for loop doing the count for each hour
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed); // adds to the list
        }
        System.out.println("All the speed are: ");

        for ( int hour=0;hour<speeds.size();hour++){ // a loop to get the speed
            double speed =speeds.get(hour); // variable to store the speed
            System.out.printf("Hour: %d Speed %.2f \n", hour, speed); // prints the speeds and hour and its data
        }
        int zeroCount= 0; // initializing zerocount to zero
       for (double speed :speeds){ // loop to check to items in the list
            if (speed==0){ // checks number of times the items in the lists is 0
                zeroCount++; // adds to the count
            }
        }
        System.out.println(" The number of times speed was 0 are " +zeroCount); // prints the number of times speed was 0

        while (speeds.contains(0.0)) { //while loop is used better when you have an enhanced for loop
            speeds.remove(0.0);
        }
        System.out.println(speeds);

        double total =0;
        for (double speed: speeds){
            total= total+speed;
        }
        double average = total/speeds.size();
        System.out.println(" The average speed is " +average);

    }



}
