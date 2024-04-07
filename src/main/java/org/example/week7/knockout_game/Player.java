package org.example.week7.knockout_game;

public class Player {
    private String name;// setting name as an attributes to differentiate btn players
    private boolean knockout; // checking if they are still in the game or not
    private int knockedOutNumber;

    public Player(String name){
        this.name=name;
        this.knockout=false;
    }

    public String playTurn (DiceCup diceCup){
        int score = diceCup.rollAll();
        if (playerKnockedOut (score)){
            knockout=true;
        }

        String resultTemplate = ("Player %s rolled a total of %d and %s knocked out. (Your knockout number was %d)");
        String knockedoutOrNot = "was not";
        if (knockout){
            knockedoutOrNot= "was";
        }
        String result = String.format(resultTemplate, name, score, knockedoutOrNot,knockedOutNumber);
        return result;
    }

    public boolean playerKnockedOut (int score){
        if ( score ==knockedOutNumber){
            return true;
        }else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isKnockout() {
        return knockout;
    }

    public void setKnockout(boolean knockout) {
        this.knockout = knockout;
    }

    public int getKnockedOutNumber() {
        return knockedOutNumber;
    }

    public void setKnockedOutNumber(int knockedOutNumber) {
        this.knockedOutNumber = knockedOutNumber;
    }
}
