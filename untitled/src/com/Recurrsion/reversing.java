package com.Recurrsion;

public class reversing {
    public static void main(String[] args) {
        System.out.println(alsoReverse(1234567890));
    }
    static int reverse(int n,int rev)
    {

        if(n==0)
       return rev;
        rev=rev*10+n%10;

        return reverse(n/10,rev);
    }
    static int alsoReverse(int n)
    {
        int digits=(int)(Math.log10(n))+1;
        return PartOfAsloReversehelper(n,digits);
    }
    static int PartOfAsloReversehelper(int n,int digit)
    {
        if (n%10==n)
        { return n;}
        int rem=n % 10;
        return rem * (int)(Math.pow(10,digit-1))+ PartOfAsloReversehelper(n/10,digit-1);
    }

}
