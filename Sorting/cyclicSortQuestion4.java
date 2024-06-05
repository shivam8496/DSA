package com.Sorting;

import java.util.Arrays;

//Find Duplicates
// https://leetcode.com/problems/find-the-duplicate-number/
public class cyclicSortQuestion4 {
    public static void main(String[] args) {
        int [] arr ={2,4,5,3,6,1,3};
        System.out.println(solution(arr));
         System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int [] arr )
    {
       int i=0;
        int correct;
       while(i<arr.length)
       { correct=arr[i]-1;

           if( arr[i]!=arr[correct])
           {
               swap(arr,i,correct);
           }
        else
           i++;
       }


    }
    static void swap(int [] arr, int start , int end)
    {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
      static int solution(int [] arr)
      {cyclicSort(arr);
          int i=0;
          while(i<arr.length)
          {if(arr[i]-1!=i)
          return arr[i];
          i++;
          }
          return -1;
      }
}
