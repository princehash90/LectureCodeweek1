package org.example.week2;

import java.util.Arrays;

public class classArray {
    public static void main(String[] args) {
        String[] classRooms= {"T3010", "T3020", "T3030","T3040", "T3050","T3080"};
        for (int x= 0; x<classRooms.length;x++){ // prints all the items ib the array
            System.out.println("The classroom are "+ classRooms[x]);
            System.out.println(Arrays.toString(classRooms));// converts array into readable string
        }

    }
}
