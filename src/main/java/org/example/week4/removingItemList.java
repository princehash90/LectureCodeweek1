package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class removingItemList {
    public static void main(String[] args) {
        List<Integer> numb= new ArrayList<>();// Integer is used to add int numbers
        numb.add(2);
        numb.add(4);
        numb.add(5);
        System.out.println(numb);
        List<String> Lists =new ArrayList<>();
        Lists.add("Pine");
        Lists.add("Mango");
        Lists.add("Passion");
        Lists.add("Coffee");

        for (String s:Lists){
            System.out.println(s);
        }
        Lists.remove("Mango");// removing by value
        Lists.remove(2);// removing by index
        Lists.add(1,"PawPaw");
        System.out.println(Lists);

        if (Lists.contains("Pine")){
            System.out.println("You have selected Pine ");
        }
        int numberOfLists= Lists.size();
        System.out.println(numberOfLists);
    }
}
