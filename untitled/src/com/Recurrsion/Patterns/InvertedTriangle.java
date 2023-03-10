package com.Recurrsion.Patterns;

public class InvertedTriangle {
    public static void main(String[] args) {
        pattern(4,0);
    }
    static void pattern(int i,int j)
    {
        if (i==-1)
        {return;}
        if(j<=i)
        {
            System.out.print("*");
            pattern(i,j+1);
        }
        else {
            System.out.println("");
            pattern(i-1,0);
        }


    }
}
