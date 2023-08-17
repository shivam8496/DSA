package com.recurrsionAgain;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={1,3,2,5,9,8};
        System.out.println(Arrays.toString(selectionSort(arr,arr.length,0,0)));
    }
    static int [] selectionSort(int [] arr, int r ,int c ,int max)
    {
        if(r==0)
        {return arr;}

        if(r<c)
        {
            if(arr[c]>arr[max])
               return selectionSort(arr,r,c+1,c);
            else
               return selectionSort(arr,r,c+1,max);
        }
        else
        {
            swap(arr,r-1,max);
            return selectionSort(arr,r-1,0,max);
        }



    }
    static void swap(int [] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
