package com.shivam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter somthing  ");
        Scanner input = new Scanner(System.in);
        System.out.println(input.next());
        System.out.print("Now a  Number ==>");
        System.out.print(input.nextInt());
    }
}
