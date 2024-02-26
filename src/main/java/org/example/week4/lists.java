package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class lists {
    public static void main(String[] args) {
        List< String> arrayList= new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("world");
        arrayList.add("Hashim");// adding to the list, we use the add
        arrayList.add("MCTC");

        for (String s:arrayList){
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }
        System.out.println(arrayList);
    }
}
