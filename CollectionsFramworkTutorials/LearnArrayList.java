package com.CollectionsFramworkTutorials;

import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        System.out.println("This Is the test code For ArrayList");

        ArrayList<String> mylist=new ArrayList<>();
        mylist.add("Shivam");
        System.out.println(mylist);
        mylist.set(0,"kjgn");

        System.out.println(mylist);
        System.out.println(mylist.indexOf("kjgn")); //True or false

    }
}

