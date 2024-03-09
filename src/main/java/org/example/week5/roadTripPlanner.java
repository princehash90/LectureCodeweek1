package org.example.week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.intInput;

public class roadTripPlanner {
    public static void main(String[] args) {

        //using Map.of if you know that data wont change
        Map<String, Integer> tripPlanner=Map.of("Duluth", 154,"Brainerd",127,"Stillwater",26,
                "Ely", 245,"Red Wing",54);

        System.out.println(tripPlanner);

        int maxDistance= intInput("Enter the maximum distance you want to drive on your road trip");


        List<String> citiesInRange =new ArrayList<>();

        for (String cities:tripPlanner.keySet()){
            int miles= tripPlanner.get(cities);
            if (miles<=maxDistance){
                //System.out.println(cities + " is " + miles+ " miles away");
                citiesInRange.add(cities);// adds the cities

            }
        }

        if (citiesInRange.isEmpty()){
            System.out.println("Sorry, no Minnesota cities are within your driving distance");
        }else {
            System.out.println("Here are the cities you can drive to : "+ citiesInRange.size());
            for (String city: citiesInRange){
                System.out.println(city);
            }
        }



    }
}
