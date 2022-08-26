package com.Sorting;

import java.util.Arrays;

//Find Duplicates
// https://leetcode.com/problems/find-the-duplicate-number/
public class cyclicSortQuestion4 {
    public static void main(String[] args) {
        int [] arr ={0,3,4,5,1,2,6,7};
        cyclicSort(arr);
      System.out.println(Arrays.toString(arr));
        System.out.println(solution(arr));
    }
    static void swap(int [] arr, int start , int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    static void cyclicSort(int [] arr )
    {
       int i=0;
       while(i<arr.length)
       { int correct=arr[i];
           if(correct< arr.length && arr[i]!=arr[correct])
           {
               swap(arr,i,correct);
           }

           i++;
       }

    }
      static int solution(int [] arr)
      {
          int i=0;
          while(i<arr.length)
          {if(arr[i]!=i)
          return arr[i];
          i++;
          }
          return -1;
      }
}
