package com.Queues;



public class main {
    public static void main(String[] args) {
        DynamicQueue Q=new DynamicQueue(5);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        Q.display();

        System.out.println( Q.remove());
        System.out.println( Q.remove());
        System.out.println( Q.remove());

        Q.display();
    }
}
