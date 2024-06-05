package com.MathsForDSA;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(39));
    }

    static boolean isPrime(int n)
    { int N=2;
        if(n==1)
        {return false;}
        while(N*N <=n)
        {
            if(n%N==0)
            {
                return false;
            }
            N++;
        }
        return true;

        }

    }


