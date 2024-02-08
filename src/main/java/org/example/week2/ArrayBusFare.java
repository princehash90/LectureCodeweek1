package org.example.week2;

import static input.InputUtils.doubleInput;

public class ArrayBusFare {
    public static void main(String[] args) {
        String[] daysName= {"Monday", "Tuesday","Wednesday", "Thursday","Friday", "Saturday","Sunday"};//arrays days
        //int numberOfDays = 7;
        double fareAmount;
        double totalAmount=0.0;
        for (int day=0; day<daysName.length; day++){ // loops untill all the days in the array is read
            fareAmount = doubleInput("On "+ daysName[day]+ " what did you spend on bus fare");
            totalAmount = totalAmount + fareAmount; //adds the total
        }
        System.out.println("for the week, you spent $" + totalAmount+ "for bus fare");
    }
}

