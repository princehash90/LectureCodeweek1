package org.example.week2;

import static input.InputUtils.doubleInput;

public class busFare {
    public static void main(String[] args) {
        int numberOfDays = 7;
        double fareAmount;
        double totalAmount=0.0;
        for (int day=1; day<=numberOfDays; day++){
            fareAmount = doubleInput("On day " + day + " of the week, what did you spend on bus fare");
            totalAmount = totalAmount + fareAmount;
        }
        System.out.println("for the week, you spent $" + totalAmount+ "for bus fare");
    }
}
