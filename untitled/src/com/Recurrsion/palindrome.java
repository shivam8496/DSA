package com.Recurrsion;

public class palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1221));
    }
    static int reverse(int n)
    {
        int digits =(int)(Math.log10(n));

        return helper(n,digits);
    }
    static int helper(int n,int digit)
    {   if(n%10==n)
        {return n;}
        int rem= n % 10;
        return rem * (int)(Math.pow(10,digit))+ helper(n/10,digit-1);
    }
    static boolean palindrome(int n)
    {
        return (n==reverse(n));


    }
}
