package org.example.week7.knockout_game;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Game {
    private static DiceCup diceCup;
    private static List<Player>players;
    public static void main(String[] args) {
        //make player objects - needs names
        //get knockout numbers
        //create a dice cup
        Game knockout = new Game();
        knockout.startGame();

        play();

        printGameResults();
    }

    private void createPlayers(int numberOfPlayers) {// this method create players
        players = new ArrayList<>();// the initialized list
        for (int x = 0; x<numberOfPlayers; x++){// looping over number of players
            String name =stringInput("Enter player "+ x+ " s name");// asking for player's name
            Player player = new Player(name);// storing the name of each player to the this variable
            players.add(player);// adds the name of the player to the list
        }
    }
    private void setKnockoutNumbers() {
        for ( Player p : players){
            int knockoutNumber;
            do {
                knockoutNumber = intInput("Player "+ p.getName() + ","+ "Enter your knockout number. " +
                        "it must be 6,7,8 or 9") ;
            }while (knockoutNumber< 6 || knockoutNumber>9 );// number must be 6,7,8,9

            p.setKnockedOutNumber(knockoutNumber);
        }
    }
    public void startGame(){

        diceCup = new DiceCup(2);
        int numberOfPlayers = positiveIntInput("How many players");
        createPlayers (numberOfPlayers);

        setKnockoutNumbers();
    }
    private static void play() {
        int playerIndex = 0;
        int totalPlayers= players.size();
        while (moreThanOnePlayerInPlay()) {
            Player currenPlayer = players.get(playerIndex);
            if (currenPlayer.isKnockout()){
                System.out.println("Sorry "+ currenPlayer.getName() + "you are knocked out");
            }else {
                stringInput("Player "+ currenPlayer.getName() + "press enter to roll. ");
                String turnResult = currenPlayer.playTurn(diceCup);
                System.out.println(turnResult);
            }
            playerIndex = (playerIndex+1) % totalPlayers;// this will make players take turn after another
        }
    }

    private static boolean moreThanOnePlayerInPlay() {
        int totalInPlay= 0;
        for (Player p: players){
            if (!p.isKnockout()){
                totalInPlay++;
            }
        }
        System.out.println("There are "+ totalInPlay + "Player(s) in the game");
        if ( totalInPlay>1){
            return true;
        }else {
            return false;
        }
    }
    private static void printGameResults() {
        for ( Player player: players){
            if (player.isKnockout()){
                System.out.println("Player "+ player.getName() + " was koncked out");
            }else {
                System.out.println("Player "+player.getName() + " is THE WINNER!!!");
            }
        }
    }








}
