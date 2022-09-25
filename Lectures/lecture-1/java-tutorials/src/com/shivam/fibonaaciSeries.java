package com.shivam;

import java.util.Scanner;

public class fibonaaciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the nth number of thee fibonacci series ==>" );
        int n = input.nextInt();
        int p =0;
        int c=1;
        int temp;
        for(int i=2;i<=n;i++)
        {   temp = c ;
          c= c+p;
           p = temp ;
        }
        System.out.println("At " + n+"th Position is ==>" + c);
    }
}
