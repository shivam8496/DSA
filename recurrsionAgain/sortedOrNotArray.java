package com.recurrsionAgain;

public class sortedOrNotArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9};
        System.out.println(check(arr,1));
    }
    static boolean check(int [] arr, int i)
    {

        if(i> arr.length-1)
        {return true;}
        if(arr[i]>arr[i-1]==false)
            return false;
        return arr[i]>arr[i-1] && check(arr,i+1);
    }
}
