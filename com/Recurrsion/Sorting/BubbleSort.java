package com.Recurrsion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,7,8,3,5,9,0,10};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        helper(arr, arr.length-1, 1);

    }

    static void helper(int[] arr, int i, int j) {
        if (i==0)
            return;
        if (j<i) {
            if (arr[j] > arr[j + 1])
            {
                swap(arr, j, j + 1);

            }

            helper(arr, i, j + 1);}
            else {
                helper(arr, i -1, 0);
            }


    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }
}