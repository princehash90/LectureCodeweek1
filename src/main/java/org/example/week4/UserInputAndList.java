package org.example.week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class UserInputAndList {
    public static void main(String[] args) {
        List<String> toDoList=new ArrayList<>();// starting a new list

        while (true){ //created a while loop to continue as long as the user has more data to enter
            String data = stringInput("Please type a task you need to do or press Enter to quit");
            if (data.isEmpty()){// checks to see if the user enter nothing
                break;
            }
            if (containsIgnoreCase(toDoList,data)) {// calling the method
                System.out.println("you have already added that");
            }else {
                toDoList.add(data);
            }// it adds to the list above
        }
        System.out.println("Thank you, here are all the tasks you entered: ");
        for (String input:toDoList){// for loop to print all the items entered
            System.out.println(input);
        }

        System.out.println("you have entere " +toDoList.size()+ " tasks");
    }

    public static boolean containsIgnoreCase (List<String> lists, String data){
        for (String item:lists){// looping over the parameters
            if (item.equalsIgnoreCase(data)){
                return true;
            }
        }
        return false;
    }

}
