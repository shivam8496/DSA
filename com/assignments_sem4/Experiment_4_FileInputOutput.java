package com.assignments_sem4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Experiment_4_FileInputOutput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String  msg = input.nextLine();
        try{
            FileWriter FileWrite = new FileWriter("C:\\Users\\shiva\\OneDrive\\Documents\\DSA\\untitled\\src\\com\\assignments_sem4\\Employee.txt");
            FileWrite.write(msg);
            FileWrite.close();
            File FileRead =new File("C:\\Users\\shiva\\OneDrive\\Documents\\DSA\\untitled\\src\\com\\assignments_sem4\\Employee.txt");
            Scanner fileRead =new Scanner(FileRead);
            while(fileRead.hasNextLine()){
                String data=fileRead.nextLine();
                System.out.print(data);
            }
            fileRead.close();
        }

        catch(IOException e){
            System.out.print("Error Occurred :");
            e.printStackTrace();
        }


    }


    }








