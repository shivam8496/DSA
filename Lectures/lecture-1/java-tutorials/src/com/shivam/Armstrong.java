package com.shivam;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a Number ==>");
        int i = input.nextInt();
        System.out.println(armcheck(i));
    }
    static boolean armcheck(int o)
    { int origin, sum=0,rem=0;
       origin=o;
        while(o>0)
        {
            rem=o%10;
            sum=sum+(rem*rem*rem);
            o=o/10;

        }
        return (sum==origin);


    }
}
