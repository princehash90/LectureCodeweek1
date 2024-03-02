package org.example.week5;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class states {
    public static void main(String[] args) {

        //Treetop can be used instead if we want to print in alphabetical order or sorted
        HashMap<String,String> stateAbreviation= new HashMap<>();// format for creating a HashMap
        stateAbreviation.put("Minnesota", "MN");// using put method to enter items in the HashMap
        stateAbreviation.put("Wisconsin", "WI");
        stateAbreviation.put("Michigan", "MI");
        stateAbreviation.put("Iowa", "IA");
        System.out.println(stateAbreviation);
        System.out.println(stateAbreviation.get("Minnesota"));// get method is used to get the value of a key
        String wisconsinAbbreviation= stateAbreviation.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);


        //looping over values
        for (String stateName:stateAbreviation.keySet()){ // looping over the keyset in the hashmap
            System.out.println(stateName);// just printing the keyset
            System.out.println(stateAbreviation.get(stateName));// prints the value
        }
        for (String abbrev:stateAbreviation.values()){
            System.out.println(abbrev);
        }

        // finding a key for a value
        //keys must be unique but value can be the same for other keys


        //looping over just the keys
        String searchAbbrev= "MI";
        for (String stateName:stateAbreviation.keySet()){
            String abbreviation= stateAbreviation.get(stateName);
            if (abbreviation.equalsIgnoreCase(searchAbbrev)){
                System.out.println("Found it! The state for "+ searchAbbrev +" "+ stateName);
            }

        }

        //creating hashmap with key and values are reversed
        Map<String, String> stateAbbreviation =new HashMap<>();
        for (Map.Entry<String, String> entry:stateAbreviation.entrySet()){
            String state= entry.getKey();
            String abbrevia= entry.getValue();
            stateAbbreviation.put(abbrevia,state);
        }

        System.out.println(stateAbreviation);
        System.out.println(stateAbbreviation);

        System.out.println("There are "+ stateAbbreviation.size() + "states listed");
    }





}
