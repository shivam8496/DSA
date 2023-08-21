package com.Recurrsion_Subset_subsequence_String;

public class SubSequence {
    public static void main(String[] args) {
        System.out.println(seq("","Shivam",0));

    }

    static int seq(String p,String up,int count)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            count++;
            return count ;
        }

        return seq(p+up.charAt(0),up.substring(1),count) + seq(p,up.substring(1),count);


    }
}
