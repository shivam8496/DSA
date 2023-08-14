package com.Recurrsion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6};
        System.out.println(Search(arr,4,0, arr.length-1));
    }
    static int  Search(int [] arr,int target,int start,int end)
    {
        if(end<start)
        {return -1;}
        int mid = start + (end-start)/2;
        if (target==arr[mid])
        {return mid;}
        if( target<arr[mid])
        {return Search(arr,target,start,mid-1);}
        return Search(arr,target,mid+1 ,end);


    }
}


