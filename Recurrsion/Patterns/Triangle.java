package com.Recurrsion.Patterns;

public class Triangle {
    public static void main(String[] args) {
    pattern(3,0);
    }
    static void pattern(int i,int j)
    {
        if (i==0)
        {return;}

         if(j<i)
        {
            pattern(i,j+1);
            System.out.print("*");
 
        }


        else {
            pattern(i - 1, 0);
             if (i>1)
            System.out.println(" ");

        }

    }

}
