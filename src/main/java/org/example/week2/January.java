package org.example.week2;

public class January {
    public static void main(String[] args) {
        for (int day =1; day<= 31; day++) {
            if(day ==1 || day==21 || day== 31){
                System.out.println("January " +day + "st");
        }else if (day ==2){
                System.out.println("January " +day + "nd");
            } else if (day == 3){
                System.out.println("January " +day + "rd");
                {

                }
            } else{
                System.out.println("January " +day + "th");
            }
        }
    }
}