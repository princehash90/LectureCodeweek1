package org.example.week2;

import java.util.Random;

import static input.InputUtils.stringInput;

public class BreakExample {
    public static void main(String[] args) {
        Random randonNumbGenerator= new Random();
        while (true){
            System.out.println("Would you like a random Number?");
            System.out.println("Enter any Key for a random number, or Q to Quit");
            String userInput= stringInput();
            if (userInput.equalsIgnoreCase("Q")){
                break; // immediately stops the loop, jum to next statement after the lopp
            }
            int randomNumb= randonNumbGenerator.nextInt();
            System.out.println(" your random number " + randomNumb);
        }
        System.out.println("Thank you for using the program");
    }
}
