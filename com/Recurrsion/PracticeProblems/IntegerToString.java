package com.Recurrsion.PracticeProblems;

public class IntegerToString {
    public static void main(String[] args) {
        solution(90);
//        System.out.println(rev(1234));
    }
    static int rev(int n)
    {   int num=0;

        while(n!=0)
        {int rem=n%10;
            num=num*10+rem;
            n/=10;
        }
        return num;
    }
    static void solution(int n)
    {
        String [] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
         helper(rev(n),arr);
    }
    static void helper(int n, String [] arr)
    {
         if(n==0)
         {return;}
         if (n%10==0)
             System.out.print("Zero"+ " ");
        if(n%10!=0)
            System.out.print( arr[n%10]+ " ");

         helper(n/10,arr);

    }
}
