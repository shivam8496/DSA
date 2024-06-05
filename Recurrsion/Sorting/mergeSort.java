package com.Recurrsion.Sorting;
//Doubt!!!!!!!!!!!!
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr= {1,3,4,5,3,5,8,3,40,12};
        System.out.println(Arrays.toString(sort(arr)));
    }

     static int [] sort(int[] arr) {
        if (arr.length==1)
                 return arr;
        int mid=arr.length/2;

        int [] first=sort(Arrays.copyOfRange(arr,0,mid));

        int [] second=sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }

     static int[] merge(int[] first, int[] second) {
         int i=0;
         int j =0,k=0 ;
         int [] merged=new int[first.length+second.length];
        while( i < first.length && j < second.length)
         {
             if (first[i] < second[j])
             {
                 merged[k]=first[i];
                 i++;
             }
             else
             {
                 merged[k]=second[j];
                 j++;
             }
             k++;


         }
         while (i < first.length) {
             merged[k] = first[i];
             i++;
             k++;
         }

         while (j < second.length) {
             merged[k] = second[j];
             j++;
             k++;
         }
         return merged;
         }
    }



