package com.Queues;

public class CustomQueus {
    private int [] data;
    private static final int   DEFAULT_VALUE=10;
    int end=0;
    public CustomQueus(){
        this(DEFAULT_VALUE);
    }
    public CustomQueus(int size){
        this.data= new int[size];
    }

    public boolean add(int value){
        if(isFull())
        {
            System.out.println("Queue is Full");
            return false;
        }
        data[end++]=value;
        return true;
    }

    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed=data[0];
        for (int i = 1; i < data.length ; i++) {
            data[i-1]=data[i];
            data[i]=0;
        }

        return removed;
    }

    public void  display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i]+" -> ");
        }
        System.out.println("END");

    }

    public boolean isFull(){
        if( end==data.length)
        {return true;}
        return false;
    }

    public boolean isEmpty(){
        if( end==0)
        {return true;}
        return false;
    }

}
