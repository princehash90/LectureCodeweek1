package org.example.week5;

import java.util.HashMap;
import java.util.Map;

public class classCodes {
    public static void main(String[] args) {
        Map<Integer, String> classCodesName=new HashMap<>();
        classCodesName.put(2545, "java");
        classCodesName.put(1425,"Datacom");
        classCodesName.put(2560, "Web");
        classCodesName.put(2417,"Android");

        for (Integer code:classCodesName.keySet()){
            String name= classCodesName.get(code);
            System.out.println("ITEC "+ code+ " "+ name);
        }
        System.out.println("I am taking " +classCodesName.size());

        int searchCode =2417;
        if (classCodesName.containsKey(searchCode)){
            System.out.println("The class you entered is in the HasMap");

        }else {
            System.out.println( searchCode+ " Not found");
        }

        int searchCode2=2545;
        String className=classCodesName.get(searchCode2);
        if (className==null){
            System.out.println(searchCode2 + "Not found");
        }else {
            System.out.println("Class is found in the hashmap. The class name is "+className);
        }
    }

}
