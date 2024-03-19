package org.example.week6;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class writingArrays {
    public static void main(String[] args) throws IOException {
        final String filename = "ITEC_Classes.txt";
        List<String> classNames= List.of("Java","Web","C#");
        List<Integer> classCode = List.of(2545,2560, 2505);

        BufferedWriter bufferedWriter= new BufferedWriter(new FileWriter(filename));

        for (int i=0; i<classNames.size(); i++){
            String names = classNames.get(i);
            int codes= classCode.get(i);
            bufferedWriter.write("ITEC "+ ""+ names + codes +"\n");
        }

        bufferedWriter.close();

        BufferedReader bufferedReader= new BufferedReader(new FileReader(filename));

        List<String> classDescription = new ArrayList<>();
        String line = bufferedReader.readLine();

        while (line!=null){
            classDescription.add(line);
            line= bufferedReader.readLine();
        }

        System.out.println("End of file reached");
        System.out.println(classDescription);

    }
}
