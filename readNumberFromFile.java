package org.example.week6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class readNumberFromFile {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();

        String filenum= "numbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filenum));//

        String line= reader.readLine();

        while (line!=null){
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e){
                //ignoring
                System.out.println(line + "is not an Integer, ignoring");
            }
            line = reader.readLine();
        }
        System.out.println(numbers);
    }
}
