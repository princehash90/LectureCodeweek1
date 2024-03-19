package org.example.week6;

import javax.imageio.IIOException;
import java.awt.image.ImagingOpException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class codeStyleCheck {
    public static void main(String[] args) {
        String filename= "readNumberFromFile.java";
        int maxLineLength=50;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            boolean lineTooLong= false;// initializing boolean to false find out if there is any lines that too long
            String line = bufferedReader.readLine();// setting a string to read
            int lineCounter=1;// initializing a counter
            int numberOfLinesTooLong=0;
            while (line!=null){// using while statement to read each line
                if (line.length()>maxLineLength){// checking if the length of each line is more 100
                    System.out.println("line is "+lineCounter+" too long");
                    System.out.println(line);
                    lineTooLong=true;// this sets to true if there is lines that too long
                    numberOfLinesTooLong++;
                }
                lineCounter++;// adds to the counter
                line= bufferedReader.readLine();
            }
            if ( lineTooLong){
                System.out.println("There were" +numberOfLinesTooLong + "lines that too long");
            }else {
                System.out.println("there were no lines that too long");
            }
        }catch (IIOException e){
            System.out.println("Error reading from" +filename +" file " + "because of "+ e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
