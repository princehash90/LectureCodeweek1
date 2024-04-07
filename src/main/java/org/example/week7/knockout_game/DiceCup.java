package org.example.week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

public class DiceCup {

    private List<Dice>allDice;

    public DiceCup(int numberOfDice){// method to hold number of dice
        allDice= new ArrayList<>();// initialize arraylist to hold number of dices
        for (int d=0; d<numberOfDice;d++){// loop to loop over the number of dice
            Dice dice = new Dice();// creates a dice object
            allDice.add(dice);// adds to the list

        }
    }

    public int rollAll(){ //created a rollAll method
        int total =0;// initialzing total to 0
        for (Dice dice: allDice){// looping over allDice list from above method
            int diceRoll= dice.roll();// creates to variable to store each roll
            total= total+ diceRoll;// adds to the total
        }
        return total;
    }
}
