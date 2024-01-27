package org.example.Week1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {
        boolean cottonClothes =yesNoInput("Are you wearing cotton clothes");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes");
        boolean closedShoes = yesNoInput("Ae you wearing closed-toe shoes?");
        if ((cottonClothes|| woolClothes) && closedShoes){
            System.out.println(" you are dressed well");
        }else {
            System.out.println("you are not dressed appropriately");
        }
    }
}
