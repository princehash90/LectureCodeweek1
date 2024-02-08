package org.example.week2;

import static input.InputUtils.doubleInput;

public class AverageTestScore {
    public static void main(String[] args) {
        int numberOfTests = 5;
        double testScore;
        double testScoreSum= 0.0; // initializing helps in the sum
        double testScoreAverage;
        for (int test= 1; test<=numberOfTests; test++){ // setting the loop
            testScore = doubleInput("Enter test Score " + test); //user input is collected
            testScoreSum= testScoreSum + testScore; // adds all the score entered and stores in the variable
        }
        testScoreAverage = testScoreSum / numberOfTests; // calculates the average
        System.out.println("Average Score =" +testScoreAverage);

    }
}
