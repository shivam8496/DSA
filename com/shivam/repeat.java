package com.shivam;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        int n = input.nextInt();
        int r = input.nextInt();
        int max=0;
        while(n>0)
        { if (n%10==r)
            max+=1;
          n=n/10;

        }
        System.out.println("Reptition ==>" + max);
    }
}

