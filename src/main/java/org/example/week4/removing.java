package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class removing {
    public static void main(String[] args) {
        List<String> classNames= new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        boolean wasRemoved= classNames.remove("Programming Logic");
        System.out.println(wasRemoved);

        classNames.remove("Project Management");// object
        System.out.println(classNames);

        classNames.remove(0);
        System.out.println(classNames);

        classNames.set(0,"System Analysis");
        System.out.println(classNames);

        String search= "System Analysis";

        if (classNames.contains(search)){
            System.out.println("The list does have " +search);
        }else {
            System.out.println("The list doe not have C#");
        }
        System.out.println(classNames.size());// size is used to check for the number items in the list
        classNames.clear();// used to clear the list
        System.out.println(classNames.isEmpty());// will return if the list is empty
    }
}
