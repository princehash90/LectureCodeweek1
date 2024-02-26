package org.example.week4;

import java.util.Random;

public class randomNumb {
    public static void main(String[] args) {
        Random rnd= new Random();
        int randomNumber = rnd.nextInt(5);
        int randomNumberBtn1and10= rnd.nextInt(10)+1;
        // this used when you want a randon btn certain numbers
        System.out.println(randomNumber+ " "+randomNumberBtn1and10);
        //use space if you want to conconate two numbers

    }
}
