package com.recurrsionAgain;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSets {
    public static void main(String[] args) {
     int [] arr={1,2,2};
        ArrayList<ArrayList<Integer>> list =subsetsDuplicates(arr);
        for(ArrayList<Integer> list1:list)
        {
            System.out.println(list1);
        }
    }

    static ArrayList<ArrayList<Integer>> subsets(int [] arr)
    {
        ArrayList<ArrayList<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num:arr)
        {
           int n=outer.size();
            for (int i = 0; i <n ; i++)
            {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }

    static ArrayList<ArrayList<Integer>> subsetsDuplicates(int [] arr)
    {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end=0;
        for(int num=0;num<arr.length;num++)
        {    start=0;
            if(num>0 && arr[num-1]==arr[num])
            {
                start=end+1;
            }
            end = outer.size()-1;
            int n=outer.size();
            for (int i = start; i <n ; i++)
            {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[num]);
                outer.add(internal);
            }
        }
        return outer;

    }
}
