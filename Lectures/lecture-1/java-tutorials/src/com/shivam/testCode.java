package com.shivam;




//WAP to print a string in reverse order
//WAP to print even aor odd n an array
public class TestCode {
    public static void main(String[] args) {
    char []  b={'s','h','i','v','a','m'};
    int [] arr={1,2,3,4,5,6,7,8,9,10};
      eve_odd(arr);
      System.out.println();
      str(b);
    }

    static void eve_odd(int[] arr) {
        System.out.println("Even numbers ==>");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }}
            System.out.println();
            System.out.println("Odd numbers are ==>");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 != 0) {
                    System.out.print(arr[j] + " ");
                }

            }

    }
    static void str(char [] st)
    {
        System.out.println("Reverse string is==>");
        for (int i = st.length-1; i >=0 ; i--) {
            System.out.print(st[i]);
        }

    }


    }
