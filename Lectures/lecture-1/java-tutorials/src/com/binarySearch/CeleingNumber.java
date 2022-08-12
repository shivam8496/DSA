package com.binarySearch;

import org.w3c.dom.ls.LSOutput;

public class CeleingNumber {
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 5, 7, 8, 16, 18, 21, 36, 56, 78, 98};
        System.out.println(Celeing(arr,3));
    }
    static int Celeing(int[] arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if (target<arr[mid])
                 end=mid-1;
            else if(target>arr[mid])
                start=mid+1;
            else
                return mid;
        }
        return start;
    }
}
