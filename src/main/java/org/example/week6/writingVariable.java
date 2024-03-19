package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingVariable {
    public static void main(String[] args) throws IOException {
        int classCode= 2454;
        double averageEnrollment= 22.16;
        String className= "java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.write(" class code is " +classCode + "\n" );
        bufferedWriter.write("Average enrollment is "+averageEnrollment + "\n");
        bufferedWriter.write("Class name " +className +"\n");

        writer.close();// is same the line below
        bufferedWriter.close();

    }
}
