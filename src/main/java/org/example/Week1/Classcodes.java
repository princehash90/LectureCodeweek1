package org.example.Week1;

import static input.InputUtils.*;

public class Classcodes {
    public static void main(String[] args) {
        String name = stringInput("What is you name");
        // can be used when you know you are dealing with positive numbers only
        int NumberClasses= positiveIntInput("How many classes are you taking?");
        String units = "classes";
        if (NumberClasses==1)
            units= "Class";
        System.out.println("Hello " + name + " you are taking " + NumberClasses +" " + units);
        System.out.printf("you are taking %d %s this semester", NumberClasses, units);
        String college = "MCTC";
        String className = "Java";
        int ClassCode =intInput("Enter a Class Code");

        if (ClassCode==2545) {
            System.out.println("This is a Java Programming!");
        } else if (ClassCode==2505){
            System.out.println("This is C# Class");
        }
        else {
            System.out.println("This is not Java or C#");
        }

    }
}
