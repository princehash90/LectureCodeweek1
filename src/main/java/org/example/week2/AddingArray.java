package org.example.week2;

public class AddingArray {
    public static void main(String[] args) {
        double[] numbers= new double[3];
        numbers[0]= 45.23;
        numbers[1]= -45.23;
        numbers[2]= 45.23;

        double sum=0.0;// adding up a data, always initialize to 0

        for (int x = 0; x<numbers.length; x++){
            //loop over the array and add each value to the sum variable
            sum = sum+ numbers[x];
            System.out.println("Total Sum of number "+ sum);
        }
    }
}
