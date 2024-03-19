package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingNumbers {
    public static void main(String[] args) throws IOException {

        String filenum= "numbers.txt";

        int data1= 67;
        int data2= 65;
        int data3= 84;

        double numbers =12.34;


        FileWriter writer= new FileWriter(filenum);
        BufferedWriter bufferedWriter= new BufferedWriter(writer);
        // .write wont be able to print numerical data without "\n"
        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(data2 + "\n");
        //bufferedWriter.write(Integer.toString(data2));// is another way to write a numerical data
        bufferedWriter.write(data3 +" \n");// another way to write numerical data

        bufferedWriter.write(numbers + "\n");

        bufferedWriter.close();
    }
}
