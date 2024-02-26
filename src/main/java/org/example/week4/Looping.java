package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        List<String> classNames= new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        for ( String name: classNames){
            System.out.println(name);
        }
        System.out.println();
// index- we use it if we ned to know the index as well as data
        for ( int x= 0; x<classNames.size();x++){
            System.out.println(classNames.get(x));
        }
        System.out.println();
        while (!classNames.isEmpty()){
            String name= classNames.remove(0);
            System.out.println(name);
        }
        System.out.println(classNames);
    }

}
