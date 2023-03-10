package com.MathsForDSA;

public class NewtonRaphsonSqrt {
    public static void main(String[] args) {
        System.out.println(Sqrt(40));
    }
    static double Sqrt(double n)
    {double x=n;
        double root;
        while(true)
        {
            root=0.5*(x+(n/x));
            if (  Math.abs(root-x) < 1)
            {break;}
        }
    return root;
    }
}
