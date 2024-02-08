package org.example.week2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class textBook {
    public static void main(String[] args) {
        String[] textBook= new String[5];
        for (int x=0;x<textBook.length;x++){
            //getting data from the user
            String bookName= stringInput("Please enter name of a textbook");
            textBook[x]=bookName; // the data the user inputs is added to the array until 5 times
        }
        for (int number= 0; number<textBook.length; number++){
            System.out.println("Here are the data you entered");
            System.out.println("Book names you enter "+ (number+1) + " is " + textBook[number]);
            //prints in numbering way
        }

    }
}
