package com.LinkedLists;

import com.Queues.DynamicQueue;

public class Main {
    public static void main(String args[]) {
        DynamicQueue list=new DynamicQueue(3);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove();
        list.add(6);
        list.display();
        
    }


}
