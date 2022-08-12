package com.shivam;

import java.util.Scanner;

public class isprime {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number==>");
        int o= input.nextInt();
        System.out.println(isprime(o));
    }
    static boolean isprime(int i)
    {
        if (i==1)
            return false;

        int n=2;
            while(n*n<i)
        {
            if (i%n==0) {

                return false;
            }
            n++;
        }


        return (n*n>i);
    }

}
