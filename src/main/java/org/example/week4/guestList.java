package org.example.week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;

public class guestList {
    public static void main(String[] args) {
        List<String> guestList= new ArrayList<>(); //created an empty list
        while (true) { //created a while loop to keep asking the user to enter a guest name or enter to quit
            String guestNames = stringInput("Enter a name of a guest or enter to quit");
            if (guestNames.isEmpty()) { // if the user does put anything, it breaks from the while loop
                break;
            }
            if (containsIgnoreCase(guestList, guestNames)){ // calling the method of ignoring the case
                System.out.println("you already added " + guestNames);// prints out if the guest is already in the list
        }else {
                guestList.add(guestNames);// else adds the guest to the guest list
                System.out.println("guest " + guestNames + " is added"); // prints out a message of the guest added
            }
        }

        Collections.sort(guestList); // sorting the list in alphabet
       printGuestNames(guestList); // printing the sorted list

       while (yesNoInput("Do you want ot remove any guests?")){ // a while to ask if the user wants to remove a guest
           System.out.println("Here are all the guests");
           System.out.println(guestList); // prints out the guest list name
           if (guestList.isEmpty()){// checking to see if the guestlist is empty
               System.out.println("There are no more guests to remove");// prints out this message if it s empty
           }
           int index = positiveIntInput("enter the number of the guest to remove");// removing my index
           index--;// making index to start by 1 instead of 0
           if (index<guestList.size()){// checking to see the selected number is within the size of the list
               String removedGuest = guestList.remove(index); // removes a guest
               System.out.println("removed guest is "+removedGuest);// prints out a message
           }else {
               System.out.println("Error - Please enter a valid number of a guest");// if the user enter a number that is not on the list
           }

       }
       printGuestNames(guestList);//calling on the print method
        System.out.println("the number of guests are " + guestList.size());// prints the list after removal of a guest

       selectWinner(guestList);
    }

    private static void selectWinner(List<String> guests) { //created a method to check for prize winner

        if (guests.isEmpty()){// checking if the list is empty
            System.out.println("Warning - No guests to win the prize");// prints a warning message if the list is empty
            return;
        }
        Random rnd = new Random();// random generator
        int randomGuest = rnd.nextInt(guests.size());// creating a random within the size of the list
        String prizeWinner = guests.get(randomGuest);// get the prize winner
        System.out.println("Guest number "+ (randomGuest+1) +" "+ prizeWinner+ " wins the prize");
    }// prints the prize winner


    public static void printGuestNames(List<String> guests){ // created a print method
        System.out.println("your guest list are: \n");
        if ( guests.isEmpty()){ //checking to see if the list is empty
            System.out.println("There is no guests in the list."); // prints out
        }else{
            for (int i=0;i<guests.size();i++){ // a loop to print in numbering order
                System.out.println((i+1) + ":" + guests.get(i));// prints in numbering order
            }
        }
    }
    public static boolean containsIgnoreCase (List<String> lists, String data){ //method to check case insensitive
        for (String item:lists){// looping over the parameters
            if (item.equalsIgnoreCase(data)){// checking for the case
                return true;
            }
        }
        return false;
    }
}

