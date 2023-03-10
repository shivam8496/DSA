package com.shivam;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculator");
        int ans=0;
        while(true)
        {
            System.out.print("Enter the operation (X to stop) ==>");
            char op = input.next().trim().charAt(0);
            if (op== '+'|| op== '-' || op=='*' || op=='/' || op=='%')
            {
                System.out.println("Enter two numbers ==>");
                int a = input.nextInt();
                int b = input.nextInt();

                if (op == '+')
                    ans=a+b;
                else if (op =='-')
                    ans=a-b;
                else if (op=='*')
                    ans=a*b;
                else if (op=='/')
                    ans=a/b;
                else if (op=='%')
                    ans=a%b;
                System.out.println("Answer is ==>" + ans);

            }
            else if (op=='x'|| op=='x')
            {
                System.out.println("Programm finished !!!!");
                break;
            }
            else
                System.out.println("envalid operation!!");

        }
    }
}
