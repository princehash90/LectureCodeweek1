package org.example.week6;

import java.io.*;

public class helloReader {
    public static void main(String[] args) throws IOException {
        //FileReader reader = new FileReader("Hello.txt");
        //another simpler way to a read a file name
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Hello.txt"));
        //this can also be used to create a file
        //BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();

        while ( line!=null) {// we can use while to loop all the lines in the file until to the end
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

    }
}
