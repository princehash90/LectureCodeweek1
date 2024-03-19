package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MonthsFile {
    public static void main(String[] args) throws IOException {

        String filename= "months.txt";

        String[] months= {"Jan", "Feb", "March"};

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for ( String m:months){
            bufferedWriter.write(m + "\n");
        }
        bufferedWriter.close();


    }
}
