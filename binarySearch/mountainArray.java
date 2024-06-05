package com.binarySearch;

public class mountainArray {
    public static void main(String[] args) {
    int [] mArr={0,1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1,0,-1,-2};
    System.out.println(mountain(mArr));
    }
    static int mountain(int[] arr) {
        if (arr.length == 2 && arr[0] > arr[1])
            return 0;
        else if (arr.length == 2 && arr[0] < arr[1])
            return 1;
        else {
            int start = 0;
            int end = arr.length - 1;
            int mid = -1;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
                    return mid;
                else if (arr[mid] < arr[mid + 1])
                    start = mid;
                else if (arr[mid] > arr[mid + 1])
                    end = mid;


            }
            return mid;
        }
    }

}
