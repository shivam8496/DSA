package com.Recurrsion;

public class reversing {
    public static void main(String[] args) {
        System.out.println(reverse(123456789,0));
    }
    static int reverse(int n,int rev,)
    { if(n==0)
       return rev;

        rev=rev*10+n%10;
        return reverse(n/10,rev);
    }
}
