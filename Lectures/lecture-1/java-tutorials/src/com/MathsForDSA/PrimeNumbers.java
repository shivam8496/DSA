package com.MathsForDSA;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(1000));
    }

    static boolean isPrime(int n)
    { int N=n;
        if(n==2)
        {return true;}
        for (int i = 2; i <n ; i++) {
            if(N%i==0)
            {return false;}
        }
        return true;
    }

}
