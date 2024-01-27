package org.example.Week1;

import static input.InputUtils.yesNoInput;

public class Prerequisit {
    public static void main(String[] args) {
        boolean hasTakenItConcepts = yesNoInput (" Have you taken ITEC 1100 Info Concepts");
        boolean hasTakenItskill= yesNoInput("Have you taken ITEC 1110 Info Tech Skills ");
        boolean hasTakenWindows= yesNoInput(" Have you taken ITEC 1250  Windows Operating System");
        if (hasTakenItConcepts && hasTakenItskill && hasTakenWindows){
            System.out.println(" You met the Pre-requiste. you may Take ITEC 1310");
        }else {
            System.out.println(" You do not meet the Pre-Requiste. You need to complete all others ");
        }
    }
}
