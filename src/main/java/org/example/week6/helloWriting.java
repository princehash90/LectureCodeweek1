package org.example.week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class helloWriting {
    public helloWriting() throws IOException {
    }

    public static void main(String[] args){// error might but we let the program crush
        // if a file does not exist, by default a new file will be created
        //if the file exists, it will be overwritten
        //FileWriter writer =new FileWriter("Hello.txt");// files has to a name
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Hello.txt"))) {

            bufferedWriter.write("Hello \n");// writing into the file using write
            bufferedWriter.write("This is Java class \n");
            bufferedWriter.write("We strive to do well \n");
            bufferedWriter.newLine();
            bufferedWriter.close();// important to close otherwise nothing will be written on the file
        }catch (IOException e) {
            System.out.println("Error to writing a file");
        }


            //FileWriter writer2 = new FileWriter("Hello.txt", true);// we use true to append meaning add to text
            //without overwriting
            try (BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("Hello.txt",true))) {
                bufferedWriter2.write("Coding is what we do\n");
                bufferedWriter2.write("Good codes has good comments\n");
                bufferedWriter2.write("coding is exciting\n");
                bufferedWriter2.close();
            } catch (IOException e){
                System.out.println("Error appending data to file "+ e);
        }

    }





}
