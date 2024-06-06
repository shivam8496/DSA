package com.CollectionsFramworkTutorials;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(2);
        pq.offer(4);
        pq.offer(3);
        pq.offer(20);

        System.out.println(pq);
       System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());
    }

}
