package org.example.week2;

import java.util.Random;

import static input.InputUtils.intInput;

public class secretNumber {
    public static void main(String[] args) {
        Random random = new Random(10);
        int secretnumb = random.nextInt(100) +1; // 1-100
        int userInput= intInput("Enter a number?"); //asks the user to enter a random
        while (userInput!=secretnumb) {
            System.out.println("try again");
            if (userInput<secretnumb){
                System.out.println("guess higher");
            }
            if (userInput>secretnumb){
                System.out.println("guess lower");
            }
            userInput= intInput("Enter a number between 0 and 10?");
        }
        System.out.println("correct");
    }
}
