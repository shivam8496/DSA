package com.shivam;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
     int [] arr={1,23,4,433,23,34};
        reverse(arr);
    }
    static void swap(int[] arr,int start,int end)
    {int temp;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
//        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
        int start=0 ,end=arr.length-1;
        while(start<end)
        {swap(arr,start,end);
            start++;
            end--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
