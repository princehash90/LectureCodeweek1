package org.example.week3;

import static input.InputUtils.intInput;

public class creditsToGraduate {
    public static void main(String[] args) {// main method
        int creditsEarned= intInput ("How many credits did you earn");// asking the user for input
        int programCredit= intInput("How many credits does your program needs you to have to graduate?");
        //getting the user input the credit for the program
        int creditneeded= howManyCreditsToGraduate(programCredit, creditsEarned);// calling the method
        System.out.println("You will need " + creditneeded + " To graduate" );

    }
    public static int howManyCreditsToGraduate (int creditsEarned, int creditsNeeded){
        int creditToGraduate= creditsEarned-creditsNeeded;// doing the maths
        return creditToGraduate;
    }
}
