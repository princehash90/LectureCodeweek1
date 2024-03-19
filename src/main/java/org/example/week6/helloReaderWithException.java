package org.example.week6;

import java.io.*;

public class helloReaderWithException {
    public static void main(String[] args){
        //FileReader reader = new FileReader("Hello.txt");
        //another simpler way to a read a file name
        BufferedReader bufferedReader=null;
        try {
            bufferedReader = new BufferedReader(new FileReader("not_found.txt"));
            //this can also be used to create a file
            //BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();

            while (line != null) {// we can use while to loop all the lines in the file until to the end
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch (IOException ioe){
            System.out.println("sorry the file you are looking is not in the system " +ioe);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                }catch (IOException e){
                    System.out.println("Error Closing the file "+ e);
                }
            }
        }

    }
}

