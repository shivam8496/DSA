package com.shivam;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandelingUsingIO {
    public static void main(String[] args) throws IOException {
//        File myfile = new File("C:/Users/Shivam/Documents/DSA/Lectures/lecture-1/java-tutorials/textfile.txt");
//        myfile.createNewFile();
//        TO write
//        FileWriter fileWriter= new FileWriter("textfile.txt");
//        fileWriter.append("Hellow world\n");
//
//        fileWriter.close();
//        To read a file
//        File myfile= new File("textfile.txt");
//        Scanner input = new Scanner (myfile);
//        while (input.hasNext())
//        {
//            String str= input.nextLine();
//            System.out.println(str);
//        }
        File myfile = new File("textfile.txt");
        if(myfile.delete())
        {
            System.out.println("File has been deleted");
        }
        else
        {
            System.out.println("File has not been deleted");
        }

    }
}
