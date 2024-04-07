package org.example.week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class tireComparison {
    public static void main(String[] args) {
//        Tire example = new Tire("Bridgestone", 40,10000);
//        System.out.println("$"+example.pricePer1000Miles());
//        System.out.println(example);
//        System.out.println(example.costForSet());

        List<Tire> tiresList = new ArrayList<>();

        do {
            Tire tire = getTireInfo();
            tiresList.add(tire);
        }while (yesNoInput("More tires to add to compare"));


        Collections.sort(tiresList);
        printReport(tiresList);
 }

    private static void printReport(List<Tire> tireList) {
        for (Tire tire : tireList){
            //System.out.println(tire);
            System.out.println(tire + "total Cost for a 4 set $"+ tire.costForSet());
        }

    }

    private static Tire getTireInfo() {
        String name = stringInput("Enter nam of tire");
        double price = doubleInput("Enter price of "+ name);
        double warrantyMiles = doubleInput("Enter number of miles warranty");

        Tire tire =new Tire(name,price,warrantyMiles);
        return tire;
    }


}
