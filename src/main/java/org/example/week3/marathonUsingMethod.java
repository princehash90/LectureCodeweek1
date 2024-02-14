package org.example.week3;

public class marathonUsingMethod {
    public static void main(String[] args) {
        double currentDistance= 1;  // setting up the variables;
        double targetDistance= 26.2;
        double percentageIncrease= 1.20; // used to increase by 10%

        weeklySchedule(currentDistance,targetDistance,percentageIncrease);

        //System.out.println(week + " " +currentDistance);//prints the one more line that is greater than the marathon distance

    }

    public static void weeklySchedule(double currentDistance, double targetDistance, double percentageIncrease){
        int week=1;
        while( currentDistance < targetDistance){// setting the conditon to check for.
            System.out.println(week + " " +currentDistance);
            currentDistance= currentDistance * percentageIncrease;// increases the current distance by 10%
            week++; // counts the number of weeks
        }


    }

}
