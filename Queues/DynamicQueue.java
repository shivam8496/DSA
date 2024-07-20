package com.Queues;



public class DynamicQueue extends CirculerQueue{
    public DynamicQueue()
    {
        super();
    }
    public DynamicQueue(int value)
    {
        super(value);
    }
    @Override
    public boolean add(int value)
    {   if(isFull())
        {
           int [] temp=new int[this.data.length*2];
            int i=0;

            while(i<this.data.length)
            {
                temp[i]=this.data[(front+i)%this.data.length];
                i++;

            }
            this.front=0;
            this.end= data.length;
//            for (int i = this.front; i < this.end; i++) {
//                temp[i]=data[i];
//                i=i%this.data.length;
//            }
            data=temp;
        }

        return super.add(value);
    }

    @Override
    public void display(){
        int i=front;
        do{
            System.out.print(data[i++]+" -> ");
            i=i%data.length;
        }while(i!=end);
        System.out.println("END");
    }
}
