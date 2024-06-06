package com.CollectionsFramworkTutorials;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        Queue<Integer> q=new LinkedList<>();
        q.offer(21);
        q.offer(13);
        q.offer(14);
        q.offer(15);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
