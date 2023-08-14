package com.shivam;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
    Scanner input=  new Scanner(System.in);
        System.out.print("Enter the Name of the student ==>");
        String name=input.nextLine();
        System.out.println("");
        System.out.print("Enter the roll Number of the student ==>");
        int roll_no= input.nextInt();
        System.out.println("");
        System.out.print("Enter the marks of the student ==>");
        double marks= input.nextDouble();
        System.out.println("");
        System.out.println("Name of the student of the student is ==>"+ name);
        System.out.println("Marks of the student is ==>"+ marks);
        System.out.println("Roll number of the student is ==>"+ roll_no);

    }
}
