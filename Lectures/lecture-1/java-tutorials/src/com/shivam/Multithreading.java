package com.shivam;

class Q extends Thread{
    @Override
    public void run()
    {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("shivam" + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {

        }
    }

}

public class Multithreading {


    public static void main(String[] args)
    throws InterruptedException{
       Q p =new Q();
       p.start();
        for (int i = 1; i < 5; i++) {
            System.out.println("singh"+i);
            Thread.sleep(1000);
        }
    }
}
