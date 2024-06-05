package com.Sorting;
//Missing number

//https://leetcode.com/problems/missing-number
//Amazon
public class cyclicSortQuestion1 {
    public static void main(String[] args) {
        int[] arr = {0, 3, 1};
        CyclicSort(arr);
        System.out.println(solution(arr));
//        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void CyclicSort(int[] arr) {
        int i = 0;
        int correct;
        while (i < arr.length) {

            if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {

                i++;
            }
        }

    }
    static int solution(int [] arr)
    {
        int i= 0;
        while(i< arr.length)
        {
            if(arr[i]!=i)
                return i;
            else
                i++;
        }
        return arr.length;
    }

    //FindAllDuplicate
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static class cycleSortQuestion3 {
    }
}
