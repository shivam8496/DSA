package com.Sorting;

import java.util.Arrays;

//Also Known as Sinking sort
//Exchange sort
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,34,3,532,234,42};
        System.out.println(bubbleSort(arr));
    }

   static  String  bubbleSort(int[] arr)
   { boolean swapped=false;
       int temp;
       for (int i = 0; i < arr.length; i++) {
              swapped=false;
           for (int j = 1; j < arr.length-i; j++) {
             if (arr[j]<arr[j-1])
               //Will swap the function
             {  temp=arr[j-1];
                 arr[j-1]=arr[j];
                 arr[j]=temp;
                 swapped=true;
             }
           }
            if(!swapped)
              {break;}

       }
       return Arrays.toString(arr);
   }
}
