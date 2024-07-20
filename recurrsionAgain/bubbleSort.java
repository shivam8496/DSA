package com.recurrsionAgain;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={1,3,2,5,9,8};
        System.out.println(Arrays.toString(bubble_sort_ascending(arr,arr.length-1,0)));
        System.out.println(Arrays.toString(bubble_sort_descending(arr,arr.length-1,0)));
    }
    static int [] bubble_sort_ascending(int [] arr , int r,int c)
    {
        if(r==0)
        {return  arr;}

        if(r-1>c)
        {
            if(arr[c]>arr[c+1])
            {swap(arr,c,c+1);}

            return bubble_sort_ascending(arr,r,c+1);
        }
        else
        {
            if(arr[c]>arr[c+1])
            {swap(arr,c,c+1);}

            return bubble_sort_ascending(arr,r-1,0);
        }

    }
    static int [] bubble_sort_descending(int [] arr , int r,int c)
    {
        if(r==0)
        {return  arr;}

        if(r-1>c)
        {
            if(arr[c]<arr[c+1])
            {swap(arr,c,c+1);}

            return bubble_sort_descending(arr,r,c+1);
        }
        else
        {
            if(arr[c]<arr[c+1])
            {swap(arr,c,c+1);}

            return bubble_sort_descending(arr,r-1,0);
        }

    }
    static void swap(int [] arr,int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

}
