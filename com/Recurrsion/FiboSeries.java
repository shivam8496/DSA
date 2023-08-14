package com.Recurrsion;

public class FiboSeries {
    public static void main(String[] args) {

        int num=5;
            System.out.println(fibo(num));


    }
    static int fibo(int n)
    {

     if (n<2)
        {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

