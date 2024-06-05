package com.shivam;

public class MaxWeatlh {
    public static void main(String[] args) {
        int [][] arr={{1,3,4},
                    {2,4,3},
                    {34,4,53,33}
                   ,{23,34,322},
                {34334,33434}};
        System.out.println(MaxWealth(arr));

    }
    static int MaxWealth(int[][] arr)
    {int max=0;
        for (int person = 0; person < arr.length; person++)
        {int Account=0;
            for (int account = 0; account < arr[person].length; account++)
            { Account=Account+arr[person][account];

            }
            if (Account>max)
                max=Account;

        }

        return max;
    }
}
