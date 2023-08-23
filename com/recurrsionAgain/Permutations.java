package com.recurrsionAgain;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
    public static void main(String[] args) {
        String up="abc";
//        System.out.println( permutationsList("",up));
        System.out.println( permutationsCount("",up));
    }

    static void permutations(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutations(f+ch+s,up.substring(1) );
        }
    }

    static int permutationsCount(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);

            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+ permutationsCount(f+ch+s,up.substring(1));
        }
        return count;
    }
    static ArrayList<String> permutationsList(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> li= new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> ans= new ArrayList<>();
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationsList(f+ch+s,up.substring(1) ));
        }
        return ans;
    }
}
