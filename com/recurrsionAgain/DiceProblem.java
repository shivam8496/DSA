package com.recurrsionAgain;

import com.shivam.Array;

import java.util.ArrayList;

//Amazon Interview Question
public class DiceProblem {
    public static void main(String[] args) {
        System.out.println( combinationsCount("",7,0,6));
    }

    static ArrayList<String> Combination(String u, int up)
    {
        if(up==0)
        {   ArrayList<String> li =new ArrayList<>();
            li.add(u);
            return li;
        }

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 1;  i<= 6 && i<=up ; i++) {
            ans.addAll(Combination(u+i,up-i));

        }
        return ans;
    }

    static int combinationsCount(String u,int up,int count,int faces)
    {
        if(up==0)
        {
            System.out.println(u);
            return 1;
        }
        count=0;


        for (int i = 1;  i<= faces && i<=up ; i++) {
            count=count+combinationsCount(u+i,up-i,count++,faces);

        }
        return count;
    }

}
