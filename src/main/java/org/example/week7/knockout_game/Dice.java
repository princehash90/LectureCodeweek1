package org.example.week7.knockout_game;

import java.util.Random;

public class Dice {
    Random rnd = new Random();
    public int roll(){

        return rnd.nextInt(6) +1;// we have to add 1 to get range btn 1-6
    }
}
