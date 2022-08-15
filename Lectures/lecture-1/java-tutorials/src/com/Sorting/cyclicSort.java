package com.Sorting;

import java.util.Arrays;

// Cyclic sorting algorithm
public class cyclicSort {
    public static void main(String[] args) {
<<<<<<< HEAD
     int [] arr ={2,4,5,3,6,1,0};
=======
     int [] arr ={2,4,5,3,1,7,6,9,10,8,11};
>>>>>>> e821a80cb1ae0be466e08be3a4ffc78073d909c9
     cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int [] arr)
    {
        int i=0;
        int correct;
        while (i<arr.length)
        {correct=arr[i];

            if (arr[i]!=arr[correct])
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
