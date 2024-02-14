package org.example.week3;

public class Marathon {
    public static void main(String[] args) {
        double currentDistance= 1;  // setting up the variables;
        double targetDistance= 26.2;
        double percentageIncrease= 1.10; // used to increase by 10%

        int week=1;

        while( currentDistance < targetDistance){// setting the conditon to check for.
            System.out.println(week + " " +currentDistance);
            currentDistance= currentDistance * percentageIncrease;// increases the current distance by 10%
            week++; // counts the number of weeks
        }
        System.out.println(week + " " +currentDistance);//prints the one more line that is greater than the marathon distance

    }
}
