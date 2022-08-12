package com.shivam;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int [] arr= new int [9];
        for (int i = 0; i < 9; i++) {
            arr[i]= input.nextInt();
        }

//        for(int num:arr) //Enhanced for loop for printing array
//        {
//            System.out.print(num+" ");
//        }
//In Another Form
        System.out.println(Arrays.toString(arr));

    }
        }


