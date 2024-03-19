package org.example.week6;

import static input.InputUtils.intInput;

public class userEntersData {
    public static void main(String[] args) {
        int userInput;
        //while (userInput<1 || userInput>10){
            //userInput= intInput("Please enter a number btn 1 and 10");
       // }
        //System.out.println("you have entere "+ userInput);

        //we can also the above in different way but same result using do loop

        do {
            userInput= intInput("Please enter a number btn 1 and 10");
        }while (userInput<1 || userInput>10);
        System.out.println("you have entered "+ userInput);


    }


}
