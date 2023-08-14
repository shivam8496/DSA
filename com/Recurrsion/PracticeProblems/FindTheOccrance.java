package com.Recurrsion.PracticeProblems;
//Question Find the total number of uccrances of a number in the given array and print the indixes of element
import java.util.ArrayList;

public class FindTheOccrance {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,7,5,5,5};

        System.out.println(solution(arr,5));
    }
    static ArrayList<Integer>  solution(int [] arr ,int n)
    {  ArrayList <Integer> list= new ArrayList<Integer>();
       return helper(arr,n,0,list);
    }
      static ArrayList<Integer> helper (int [] arr ,int n,int i,ArrayList<Integer> List)
      {
          if (i> arr.length-1)
              return List;
          if(arr[i]==n)
          {List.add(i);}
          return helper(arr,n,i+1,List);
      }

}
