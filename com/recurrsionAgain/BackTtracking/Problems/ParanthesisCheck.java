package com.recurrsionAgain.BackTtracking.Problems;

import java.util.ArrayList;

public class ParanthesisCheck {
    public static void main(String[] args) {
int n=3;
        ArrayList<String> ans=new ArrayList<>();
        System.out.println(generate(n,0,0,"",ans));
    }
    static ArrayList<String> generate(int n,int left ,int right,String answer,ArrayList<String> ans)
    {
        if(answer.length()==n*2)
        {
            ans.add(answer);
            return ans;
        }

        if(left<n)
        {
            generate(n,left+1,right,answer+"(",ans);
        }
        if(right<left)
        {
            generate(n,left,right+1,answer+")",ans);
        }
        return ans;
    }
}
