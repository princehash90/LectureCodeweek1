package org.example.week2;

public class ArrayExample {
    public static void main(String[] args) {
        int [] number= new int[5];
        number [0]=4*2;
        number[1]=100;
        number[3]=3;
        System.out.println(number[0]);

        String [] className= {"Java", "C#", "web"};
        className [0]="Java ";
        className[1]= "C#";
        className [2]="Web";
        System.out.println("one of the second year classes is"+ className[1]);
        int numberOfClasses = className.length;// finding out the number data stored in a array
        System.out.println(numberOfClasses);

    }
}
