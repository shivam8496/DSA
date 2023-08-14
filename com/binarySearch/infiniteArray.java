package com.binarySearch;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(infinit(arr, 11));

    }

    static int infinit(int[] arr, int target) {
        if(target>arr[arr.length-1])
        {
            System.out.println("Index out of bound :(");
            return -1;}
        int start = 0;
        int end = 2;
        int mid = 0;
        while (true) {
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
                else if (target == arr[mid]) {
                    return mid;
                }
            }
            if (target == arr[mid])
                break;
            while (end <= arr.length - 1) {
                if (end * 2 <= arr.length - 1) {
                    end = end * 2;
                    break;
                } else {
                    end = arr.length - 1;
                }
                if (arr[mid] != target)
                    break;
            }

        }
        return -1;
    }
}






