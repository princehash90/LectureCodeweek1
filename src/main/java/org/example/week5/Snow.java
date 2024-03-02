package org.example.week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {
        Map<String,Double> snowfall=new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.0);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April",0.0);

        System.out.println(snowfall);

        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        System.out.println("The snow in January is "+ snowfall.get("January")+ " inches");

        System.out.println("The snow in July is "+ snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")){
            System.out.println("There was snow in July");
        }else {
            System.out.println("There was no snow in July");
        }

        double total= 0;

        for (double snow : snowfall.values()){
            total+=snow;
        }
        System.out.println("The total snow is " +total);

        for (String item: snowfall.keySet()){
            double snow = snowfall.get(item);
            System.out.printf(" the in %s was %.2f inches \n", item,snow);
        }

        String newMonth = stringInput("Enter a name of a month?");
        double newSnow = doubleInput("Enter amount of snow "+ newMonth);

        //snowfall.put(newMonth,newSnow);

        System.out.println(snowfall);

        if (snowfall.containsKey(newMonth)){
            double snow = snowfall.get(newMonth);
            System.out.printf("The hashmap already contains that month %s snow %.2f inches", newMonth, snow);
            boolean overWrite = yesNoInput("Do you want to overwrite it");
            if (overWrite){
                snowfall.put(newMonth,newSnow);
            }else {
                System.out.println("Data was not added.");
            }
        }else {
            snowfall.put(newMonth,newSnow);
        }
        System.out.println(snowfall);




    }
}
