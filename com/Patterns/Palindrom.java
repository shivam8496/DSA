package com.Patterns;

import java.util.Locale;

//Palindrome in strings
public class Palindrom {
    public static void main(String[] args) {
   String srt="Abcba";
        System.out.println(isPalinddrome(srt));
    }
//    rwo pointer method .
    static boolean isPalinddrome(String str)
    {  str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            char start= str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
                return false;

        }
        return true;
    }
}
