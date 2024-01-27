package org.example.Week1;

import static input.InputUtils.intInput;

public class SecretNumber {
    public static void main(String[] args) {
        int SecretNumber= 6;
        int guess = intInput("Guess the number I am Thinking of now");
        if (guess==SecretNumber){
            System.out.println("you guessed correctly");
        } else if (guess-SecretNumber==1) {
            System.out.println("your Guess is 1 too high");
        } else if (SecretNumber-guess ==1) {
            System.out.println("your guess is 1 too low");
        } else {
            //if the user did not guess correctly
            System.out.println(" Sorry,i was thinking of " + SecretNumber);
        }
    }
}
