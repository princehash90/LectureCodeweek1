package org.example.week3;

import java.sql.Array;
import java.util.Arrays;

public class corpororatesponsors {
    public static void main(String[] args) {
        String[] corporate= {"Ikea", "at&t", "cvs","3m"}; // setting up the array
        for (int x=0;x< corporate.length; x++){
            corporate[x]=corporate[x].toUpperCase();// easier code

        }
        System.out.println(Arrays.toString(corporate)); // Arrays.toString helps prints in the array format

    }

}
