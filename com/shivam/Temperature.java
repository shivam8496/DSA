package com.shivam;

import java.util.Scanner ;

public class Temperature {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in celcius ==>");
     float tempC= input.nextInt();
     float tempF= (tempC *1.8f)+32f;
        System.out.println("The temperature in Farenhite ==>" + tempF);
        System.out.println("The temperature in Kelvin ==>"+ (float)(273+tempC));
    }
}
