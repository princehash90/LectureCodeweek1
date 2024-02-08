package org.example.week2;

import static input.InputUtils.intInput;

public class CountineExample {
    public static void main(String[] args) {
        int numberEntered = 0;
        int SumOfNumbers = 0;
        while (numberEntered < 5) {
            int number = intInput("Please enter a number btn 0 and 100");
            if (number < 0 || number > 100) {
                continue;
                // skips the rest of the loo. if the while loop is still true, the loop will continue
            }
            numberEntered++;
            System.out.println("You have now entered " + numberEntered +
                    "numbers. the last valid number you entered was " + number);
            SumOfNumbers=SumOfNumbers+number;
        }
        System.out.println("Thank you for using the program. The total off numbers was "+ SumOfNumbers);
        System.out.println("And the Average of all 5 numbers was "+ SumOfNumbers/5);


    }
}
