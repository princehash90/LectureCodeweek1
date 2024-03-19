package org.example.week6;

public class stringToNumber {
    public static void main(String[] args) {
        String hopeThisIsANumber = "Cat";
        try {// you use try to bracket btn the area you think might cause a crush
            int number = Integer.parseInt(hopeThisIsANumber);
            System.out.println(number);
        } catch (NumberFormatException e){// catching the kind of exception we think might occur/
            //on this NumberFormatException
            System.out.println( hopeThisIsANumber +" is not a valid integer");
            //instead of the program crushing, it prints the above message to the user
        }
        System.out.println("End of the program");
    }

}
