package com.Recurrsion_Subset_subsequence_String;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {
    public static void main(String[] args) {
        seqAscii("","abc");

    }

    static void seq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return  ;
        }

        seq(p+up.charAt(0),up.substring(1)) ;
        seq(p,up.substring(1));


    }

    static void seqAscii(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return  ;
        }

        seq(p+up.charAt(0),up.substring(1)) ;
        seq(p,up.substring(1));
        seq((p+(up.charAt(0)+0)),up.substring(1));
        
    }
    static int seqCount(String p,String up,int count)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            count++;
            return count ;
        }

        return seqCount(p+up.charAt(0),up.substring(1),count) + seqCount(p,up.substring(1),count);


    }
    static ArrayList<String> seqReturn(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> li = new ArrayList<>();
            li.add(p);
            return li;

        }

        ArrayList<String> left = seqReturn(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = seqReturn(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
