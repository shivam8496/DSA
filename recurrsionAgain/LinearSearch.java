package com.recurrsionAgain;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,8};
        ArrayList<Integer> li = new ArrayList<>();
        System.out.println(LsearchFindAll(arr,0,4));
    }
    static boolean Lsearch(int [] arr, int index,int target)
    {
        if(index==arr.length)
        {
            return false;
        }

        return arr[index]==target || Lsearch(arr,index+1,target);

    }
    static int Lsearchindex(int [] arr, int index,int target)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {return index;}

        return  Lsearchindex(arr,index+1,target);

    }

    static ArrayList<Integer> Lsearch(int [] arr,int index , int target, ArrayList<Integer> li)
    {
        if(index==arr.length )
        {   if(li.size()==0) {
            li.add(-1);
            return li;
        }
            else
            return li;
        }
        if(arr[index]==target)
        {
            li.add(index);
        }
        return Lsearch(arr,index+1,target,li);
    }

    static ArrayList<Integer> LsearchFindAll(int [] arr,int index , int target)
    {
        ArrayList<Integer> li= new ArrayList<>();
        if(index==arr.length )
        {
            return li;
        }

        if(arr[index]==target)
        {
            li.add(index);
        }
        ArrayList<Integer> ansfrombelow= LsearchFindAll(arr,index+1,target);

        li.addAll(ansfrombelow);

        return li;
    }
}
