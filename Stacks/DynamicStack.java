package com.Stacks;

import java.util.Arrays;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); //Will call CustomStack()
    }

    public DynamicStack(int value){

        super(value); //Will call CustomStack(int value)
    }

    @Override
    public boolean push(int value)
    {
        if(this.isFull())
        {   int [] temp=new int[data.length *2 ];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;
        }

         return super.push(value);
    }
}
