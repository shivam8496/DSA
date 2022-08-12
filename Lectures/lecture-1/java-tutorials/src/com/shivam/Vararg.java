package com.shivam;


import java.util.Arrays;

public class Vararg {
    public static void main(String[] args) {
    function(1,2,3,4,5);
    }
    static void  function(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
