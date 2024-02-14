package org.example.week3;

import static input.InputUtils.doubleInput;

public class square {
    public static void main(String[] args) {
        double number = doubleInput("Enter a number and i will square it");
        double squared= square(number);
        System.out.println("the square of " + number + " is " + squared);
    }
    public static double square(double n){
        double sq = n*n; // doing the maths of squaring
        return sq; // returns the answer of the number squared
    }
}
