package com.binarySearch;

public class charCeleingCheck {
    public static void main(String[] args) {
        char [] arr ={'c','d','f','g','i'};
        System.out.println(charCeling(arr,'g'));

    }
    static char charCeling(char[] arr,char target)
    {   if (target==arr[arr.length-1])
        return arr[0];
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end)
        {
            mid=start+(end-start)/2;
            if (target<arr[mid])
                end=mid-1;
            else
                start=mid+1;


        }
       return arr[start];

    }
}
