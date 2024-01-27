package org.example.Week1;

import static input.InputUtils.stringInput;

public class SentenceEnding {
    public static void main(String[] args) {
        System.out.println("Enter a statement here");
        String userStatment = stringInput();
        if (userStatment.endsWith(".")!=true){
            System.out.println("A sentence should end with a .");
        }else {
            System.out.println("you did it");
        }
    }
}
