package com.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr={2,6,5,4,3};
       selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int findMax(int[]arr , int start, int end)
    { int max=arr[start];
         int maxIndex=start;
        for (int j = 0; j <= end; j++) {
            if (max<arr[j])
            {max=arr[j];
             maxIndex=j;}
        }
        return maxIndex;

    }
  static void swap(int[] arr,int first, int second)
  {
      int temp;
      temp=arr[first];
      arr[first]=arr[second];
      arr[second]=temp;
  }
    static void selectionSort(int [] arr)
    {   int temp;
        int maxindex2;
        for (int i = 0; i < arr.length; i++) {
          //Will find the maximum number in the array
            int last =arr.length-1-i;
          maxindex2=findMax(arr,0, last);
          //Swapping max at the right place.
          swap(arr,last,maxindex2);
        }

    }

}
