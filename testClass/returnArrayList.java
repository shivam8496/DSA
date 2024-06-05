package com.testClass;
import java.util.ArrayList;
import java.util.*;

public class returnArrayList
{
    public static void main(String[] args) {
        int [] arr={9,8,7,6,5,4,3,2,1,0};

        QuickSort(arr,0,(arr.length-1));
        System.out.println(Arrays.toString(arr));
    }

    static void QuickSort(int [] arr,int s,int e)
    {
        int low=s;
        int high=e;

        int p=(s+e)/2;
        if(s>=e)
        {
            return;
        }

        while(low<=high)
        {
            while(arr[low]<arr[p])
            {
                low++;
            }
            while(arr[high]>arr[p])
            {
                high--;
            }

            if(low<=high)
            {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }



        }

        QuickSort(arr,p,high);
        QuickSort(arr,low,p);

    }
}
