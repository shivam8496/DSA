package com.recurrsionAgain;

public class Triangle_pattern {
    public static void main(String[] args) {
    Traingle(10,0);
    InvertedTraingle(10,0);
    }
    static void Traingle(int r,int c)
    {
        if(r == 0)
        {

            return;
        }
        if(r>c)
        {   Traingle(r,c+1);
            System.out.print (" * ");

        }
        else
        {
            Traingle(r-1,0);
            System.out.println("");

        }

    }
    static void InvertedTraingle(int r,int c)
    {
        if(r == 0)
        {
            System.out.println("");
            return;
        }
        if(r>c)
        {
            System.out.print (" * ");
            InvertedTraingle(r,c+1);

        }
        else
        {
            System.out.println(" ");
            InvertedTraingle(r-1,0);

        }
    }
}
