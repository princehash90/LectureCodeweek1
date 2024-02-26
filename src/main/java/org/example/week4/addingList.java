package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class addingList {
    public static void main(String[] args) {
        List<Integer> classCode= new ArrayList<>();// creating a new list
        classCode.add(2545);// adding to the list
        classCode.add(1150);// adding to the list
        classCode.add(1250);//adding to the list

        classCode.add(0,1425);// this adds the start of the list
        classCode.add(2,1100);

        System.out.println(classCode);// just prints the items in the list in a array
        System.out.println("the size is "+classCode.size());// prints the size of the list

        for (int classCodes:classCode){// loop to cover all the items in the loop
            System.out.println("ITEC "+classCodes);// prints the items but in a new line
        }

    }
}
