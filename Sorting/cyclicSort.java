package com.Sorting;

import java.util.Arrays;

// Cyclic sorting algorithm
public class cyclicSort {
    public static void main(String[] args) {
     int [] arr ={2,4,5,3,6,1,3,0};



     cyclicSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void cyclicSort(int [] arr)
    {
        int i=0;
        int correct;
        while (i<arr.length)
        {correct=arr[i];

            if (correct< arr.length && arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else {
                i++;
            }

        }
    }
    static void swap (int [] arr ,int first ,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
