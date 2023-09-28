package com.Queues;



public class main {
    public static void main(String[] args) {
        CustomQueus Q=new CustomQueus(5);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
//        Q.display();
         Q.remove();
        Q.remove();
        Q.remove();

        Q.display();
    }
}
