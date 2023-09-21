package com.LinkedLists;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
//        [1,2]
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(3);
        list.tail.next=list.head;
                                int pos=list.cyclePos(list.head);
        System.out.println(pos);

    }
}
