package org.example.week3;

import static input.InputUtils.*;

public class Tire {
    public static void main(String[] args) {

        int numberOfTireToCompare = positiveIntInput("Enter the number tire Brands to compare");
        String [] tireReport = new String[numberOfTireToCompare];
        for (int x = 0; x < numberOfTireToCompare; x++) {
            String report = getTireInfo();
            tireReport[x]=report;
            //System.out.println(tireReport[x]);
        }
        printReportTable(tireReport);
    }

    private static void printReportTable(String[] tireReport) {
        for (int x=0;x<tireReport.length;x++){
            System.out.println(tireReport[x]);
        }
    }


    public static String getTireInfo(){
        String tireName = stringInput("What is the name of the tire");
        double price = doubleInput("Enter the price of the tire");
        double miles= doubleInput("enter warranty mile for "+tireName);
        double pricePer1000Miles= price/miles *1000;
        return "the tire " +tireName + "gives $" + pricePer1000Miles+ " dollar per a thousand mile";
    }
}
