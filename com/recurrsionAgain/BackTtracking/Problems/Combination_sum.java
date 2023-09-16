package com.recurrsionAgain.BackTtracking.Problems;

// Problem Link(medium) - https://leetcode.com/problems/combination-sum/description/

import java.util.ArrayList;

public class Combination_sum {

    public static void main(String[] args) {
        int [] candidates ={2,3,5};
        int target =8;
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<ArrayList<Integer>> answer0=new ArrayList<>();

        ArrayList<ArrayList<Integer>> answer1=solution(candidates,8,0,0,ans,answer0);



            System.out.println(answer1);


    }

      static ArrayList<ArrayList<Integer>> solution(int [] arr,int t,int s,int index,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> answer)
    {   if(s>t)
        {
            return answer ;
        }
        if(s==t)
        {  ArrayList<Integer> li=new ArrayList<>();
            li.addAll(ans);
//            System.out.println(ans);
            answer.add(li);
            return answer;
        }
        for (int i = index; i < arr.length; i++) {
            ans.add(arr[i]);
            s=s+arr[i];
            solution(arr,t,s,i,ans,answer);
            ans.remove(ans.size()-1);
            s=s-arr[i];

        }

        return answer;

    }

}
