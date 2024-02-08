package org.example.week2;

import static input.InputUtils.stringInput;

public class WhileLoopSecretPassword {
    public static void main(String[] args) {
        String secretWord = "kitten"; //setting up the secret pasword to a variable
        String userInput= stringInput("Enter the password");
        int maxGuesses= 5; // setting a varible is always better than magical numbers
        // asking the user for their input
        while (! userInput.equals(secretWord) && maxGuesses>1){
            System.out.println("password incorrect");
            //and ask the user to try
            System.out.println("Try again");;
            userInput =stringInput("Enter the password again");
            maxGuesses--;
        }
        if (maxGuesses>1){
            System.out.println("Correct Password-access granted");
        }
        else {
            System.out.println("Account locked");
            System.exit(0);
        }
    }
}
