package com.recurrsionAgain;

//Amazon Interview Question
public class DiceProblem {
    public static void main(String[] args) {
        Combination("",4);
    }

    static void Combination( String u,int up)
    {
        if(up==0)
        {
            System.out.println(u);
            return;
        }
        for (int i = 1; i<=6 && i<=up ; i++) {
            Combination(u+i,up-i);

        }
    }

}
