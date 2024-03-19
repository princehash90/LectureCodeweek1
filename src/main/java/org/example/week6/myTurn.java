package org.example.week6;

import java.io.*;

public class myTurn {
    public static void main(String[] args) throws IOException {

        String fileName = "my.txt";// you can set up a variable to store the file name

        String name = "My name is Hashim";
        String favColor ="Red";
        int classCode = 2545;

        FileWriter writer = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(name + "\n");
        bufferedWriter.write("my favourite color is " +favColor + "\n");
        bufferedWriter.write("This class code is " +classCode+ "\n");
        bufferedWriter.close();

        BufferedReader bufferedReader= new BufferedReader(new FileReader(fileName));

        String line = bufferedReader.readLine();

        while (line!=null){
            System.out.println(line);
            line =bufferedReader.readLine();
        }

        bufferedReader.close();
    }


}
