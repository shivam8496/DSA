package com.CollectionsFramworkTutorials;

import java.util.ArrayDeque;
import java.util.Queue;
public class LearnDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(2);
        adq.offer(3);
        adq.offer(4);
        System.out.println(adq);
        adq.offerFirst(1);
        adq.offerLast(5);
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
