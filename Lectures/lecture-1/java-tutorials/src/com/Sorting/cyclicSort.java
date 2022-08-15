package com.Sorting;

import java.util.Arrays;

// Cyclic sorting algorithm
public class cyclicSort {
    public static void main(String[] args) {
     int [] arr ={2,4,5,3,1,7,6,9,10,8,11};
     cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int [] arr)
    {
        int i=0;
        int correctIndex;
        while (i<arr.length)
        {correctIndex=arr[i]-1;
            if (arr[i]!=arr[correctIndex])
            {
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }

        }
    }
    static void swap (int [] arr ,int first ,int second)
    {int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
