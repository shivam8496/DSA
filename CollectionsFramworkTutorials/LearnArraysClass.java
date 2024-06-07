package com.CollectionsFramworkTutorials;
import java.util.Arrays;
public class LearnArraysClass {
    public static void main(String[] args) {

        int [] arr ={44,2,24,43,4,2,2,2};
//        Arrays.fill(arr,9);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       int ans= Arrays.binarySearch(arr,2);
        System.out.println(ans);
    }


}
