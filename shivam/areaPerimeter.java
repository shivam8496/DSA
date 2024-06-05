package com.shivam;

import java.util.Scanner;

public class areaPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float r= input.nextFloat();
        double a=3.14159*r*r;
        double p=3.14159*r*2;
        System.out.println(a);
        System.out.println(p);
    }
}
