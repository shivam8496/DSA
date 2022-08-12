package com.binarySearch;
//Only works for sorted array(Acending OR Descending Order )
public class BinarySearchAlgo {
    public static void main(String[] args)
    {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};

        System.out.println(binarySearch(arr,11));

    }
    static int binarySearch(int [] arr,int target)
    {
        int start=0;
        int end = arr.length-1;
        int mid;
        while(start<=end)
        {
             mid = start + (end-start)/-2;
             if (target<arr[mid])
                 end=mid-1;
             else if (target>arr[mid])
                 start=mid+1;
             else  if (target==arr[mid])
                 return mid;

        }
        return -1;   //-1 Means number is not present .

    }
}
