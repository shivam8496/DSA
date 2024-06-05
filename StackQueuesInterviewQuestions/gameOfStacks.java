package com.StackQueuesInterviewQuestions;


import com.shivam.Array;

import java.util.Arrays;

//Game Of Stacks
//Hacker Rank
public class gameOfStacks {
    static int two_stacks(int max, int [] a, int [] b)
    {
        return helper(max,a,b,0,0)-1;
    }
    private static int helper(int max,int [] a,int [] b,int sum,int count)
    {
        if(sum>max)
        {
            return count;
        }

        if(a.length==0 || b.length==0)
        {
            return count;
        }

        return Math.max(helper(max, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1),helper(max, a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1));

    }

    public static void main(String[] args) {
        int [] a={4,2,4,6,1};
        int [] b={2,1,8,5};
        System.out.println(two_stacks(10,a,b));
    }

}
