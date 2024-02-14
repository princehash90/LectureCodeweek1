package org.example.week3;

import static input.InputUtils.intInput;

public class count {
    public static void main(String[] args) { // the main method
        int smallNumber= intInput("Enter a small number");// getting input from the user, small number
        int largenumber= intInput("Enter a largr number");
        System.out.println("i will count from " +smallNumber +" to " +largenumber );// prints the statement
        count(smallNumber,largenumber); // calling the method

    }
    public static void count(int min, int max) {// using the void so to mean it will not return anything
        for (int x=min;x<=max; x++){// setting up the loo
           System.out.println(x);

        }
    }

}
