package com.binarySearch;

//Facebook problem ...

import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,3,3,4,4,6,8,8,9,9,9,10,10,10};
        solution(arr,4);


    }
    static void solution(int[] arr, int target )
    { int[] ar2={-1,-1};
     int start=search(arr,target,true);
     int end=search(arr,target,false);
     ar2[0]=start;
     ar2[1]=end;
        System.out.println(Arrays.toString(ar2));


    }
    static int search(int [] arr, int target,boolean firstIndex)
    {   int ans =-1;
        int start=0;
        int end= arr.length-1;
        int mid;
        while (start<=end)
        {
            mid= start+(end-start)/2;
            if(target<arr[mid])
                end=mid-1;
            else if (target>arr[mid])
                start=mid+1;
            else { //potential answer.
                ans =mid;
                if( firstIndex==true)
                 end=mid-1;
                else
                start=mid+1;
            }

        }
        return ans;
    }
}
