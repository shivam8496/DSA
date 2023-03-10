package com.shivam;

public class WrapperClass {

    public static void main(String[] args) {
        Integer num = 123; // to Primitive data type into Object from 
        int myInt = num.intValue(); //To again convert into Primitive valur
        String str = num.toString(); //To Convert into string
        int obj = num.valueOf(str);
        System.out.println(obj);
    }

}
