package com.LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertLast(6);


//        System.out.println(list.deletefirst());
        list.InsertRec(7,6);
        list.display();
    }
}
