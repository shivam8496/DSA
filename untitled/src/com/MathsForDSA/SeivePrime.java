package com.MathsForDSA;

public class SeivePrime {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n + 1];
        seive(n,prime);

    }

    //    Initially all the elements of the boolean array are false
//    False means it is prime
    static void seive(int n, boolean[] primes) {
        for (int i = 2; i * i <=n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
            }
            for (int k = 2; k <=n; k++) {
                if (primes[k]==false) {
                    System.out.print(k + " ");
                }
            }


    }
}