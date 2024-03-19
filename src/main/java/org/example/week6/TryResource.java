package org.example.week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {
    public static void main(String[] args) {
        //FileReader reader = new FileReader("Hello.txt");
        //another simpler way to a read a file name
        BufferedReader bufferedReader=null;
        try { bufferedReader = new BufferedReader(new FileReader("not_found.txt"));
            // having the block inside the try reduces the lines to code, simply simpliying
            String line = bufferedReader.readLine();
            while (line != null) {// we can use while to loop all the lines in the file until to the end
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        }catch (IOException e){
            System.out.println("sorry the file you are looking is not in the system " +e);
        }
    }
}



