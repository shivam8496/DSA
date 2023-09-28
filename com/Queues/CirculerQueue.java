package com.Queues;

import javax.swing.*;

public class CirculerQueue {
    protected int [] data;
    private static final int DEFAULT_VALUE=10;
    int size=0;
    int end=0;
    int front=0;
    public CirculerQueue(int n){
        this.data=new int[n];
    }

    public CirculerQueue() {
        this(DEFAULT_VALUE);
    }

    public boolean add(int value)
    {
        if(isFull())
        {
            System.out.println("Queue is Full");
            return false;
        }
        data[end++]=value;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        int removed=data[front++];
        front=front % data.length;
        size--;
        return removed;
    }

    public void display(){
        int i=front;
        do{
            System.out.print(data[i++]+" -> ");
            i=i%data.length;
        }while(i!=end);
        System.out.println("END");
    }
    public boolean isFull(){
        if(size==data.length)
        {
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(size==0)
        {
            return true;
        }
        return false;
    }
}
