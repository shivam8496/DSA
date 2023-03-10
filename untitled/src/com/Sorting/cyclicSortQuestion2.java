package com.Sorting;

import java.util.Arrays;

//Google
public class cyclicSortQuestion2 {
    public static void main(String[] args) {
        int [] arr={ 3,0,1,1,2,5,4,6,7,2,9};
        CyclicSort(arr);
        System.out.println(Arrays.toString(arr));
       int [] ans={};
        int i=0;
        while(i< arr.length)
        {
            if(arr[i]!=i)
            {
                System.out.print(i+" ");

            }

            i++;
        }
    }
    static void swap(int [] arr,int first ,int second)
    {int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;


    }
    static void CyclicSort(int[] arr) {
        int i = 0;
        int correct;
        while (i < arr.length) {

            if ( arr[i]!= arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {

                i++;
            }
        }

    }
}