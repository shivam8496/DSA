package com.shivam;

public class evenNumber {
    public static void main(String[] args) {
        int [] arr={12,3,232,2333,2233};
        System.out.println(even(arr));;
//    System.out.println(check(899902));
    }
    static boolean check(int num)
    {int sum=0;
        for (int i = num; i>0 ; i=i/10)
        {
            sum++;

        }
         return sum%2==0;
    }
    static int even(int[] arr)
    { int sum=0;
        for (int i = 0; i < arr.length; i++) {
         if (check(arr[i]))
             sum++;

        }
        return sum;
    }

}
