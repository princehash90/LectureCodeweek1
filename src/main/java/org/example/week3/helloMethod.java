package org.example.week3;

import static input.InputUtils.stringInput;

public class helloMethod {
    public static void main(String[] args) {
        String name= stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }
    public static String makeGreeting(String n){// created the method and it has type and name of parameter
        String greeting = "Hello " + n + "!";// this message is printed
        return greeting;// return or output the message
    }
}
