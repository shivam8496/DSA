package com.recurrsionAgain;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr={8,10,14,1,2,5,7};
        System.out.println(RBS(arr,0,7, arr.length-1));
    }
    static int RBS(int [] arr,int s,int target,int e)
    {   int mid= (s+e)/2;
        if(s>e)
        {
            return -1;
        }
        if(arr[mid]==target)
        {
            return mid;
        }
        if (arr[s]<=arr[mid])
            if (target>=arr[s]&& target<=arr[mid])
               return RBS(arr,s,target,mid-1);
            else RBS(arr,mid+1,target,e);
        if (target>=arr[mid] && target<=arr[e])
            return RBS(arr,mid+1,target,e);
        else return RBS(arr,s,target,mid-1);


    }
}
