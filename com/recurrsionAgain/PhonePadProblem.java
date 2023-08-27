package com.recurrsionAgain;

import java.util.ArrayList;

//LeetCode Meduim   (Google)
public class PhonePadProblem {
    public static void main(String[] args) {
        System.out.println(solution("","79"));
    }
    static ArrayList<String> solution(String p, String up)
    {
        if(up.isEmpty())
        {   ArrayList<String > li= new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String > ans= new ArrayList<>();
        int digit = up.charAt(0)-'0';  //Will convert "2" into 2

        if(digit==9 || digit==7)
        {
            for (int i = (digit-2)*3 ; i <=(digit-1)*3; i++) {

                char ch=(char)('a'+i);
                ans.addAll(solution(p+ch,up.substring(1)));

            }
        }
        else{
        for (int i = (digit-2)*3 ; i <(digit-1)*3 ; i++) {

            char ch=(char)('a'+i);
            ans.addAll(solution(p+ch,up.substring(1)));

        }}

        return ans;

    }
}
