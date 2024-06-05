package com.shivam;

public class linearSeries {
    public static void main(String[] args) {
        int[][] arr={{1,34,5},
                {2,4,6,5,24},
                {3,45,6,64}};
        System.out.println(min(arr));
    }
    static int min(int[][] arr)
    { int min=arr[0][0];
        for (int row = 1; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length ; col++) {


                if (arr[row][col]<min)
                {min=arr[row][col];}
            }



        }
        return min;

    }
}
