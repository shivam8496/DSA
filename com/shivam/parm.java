package com.shivam;

public class parm {
    public static void main(String[] args) {
        parm();
    }
    static void parm()
    {int rem=0;
        for(int i=100;i<1000;i++)
        { int original,origin,sum=0;
            original=i;
            origin=i;
            while(origin>0)
            {
                rem=origin%10;
                sum=sum+(rem*rem*rem);
                origin=origin/10;


            }
            if (sum==original)
                System.out.println(sum);



        }
    }
}
