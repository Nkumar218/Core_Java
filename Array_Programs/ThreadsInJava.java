package com.lara4;

class Shared1
{
    synchronized void methodOne(Shared1 s)
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        s.methodTwo(this);
    }
 
    synchronized void methodTwo(Shared1 s)
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        s.methodOne(this);
    }
}
 
public class ThreadsInJava
{
    public static void main(String[] args)
    {
        final Shared1 s1 = new Shared1();
 
        final Shared1 s2 = new Shared1();
 
        Thread t1 = new Thread()
        {
            public void run()
            {
                s1.methodOne(s2);
            }
        };
 
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s2.methodTwo(s1);
            }
        };
 
        t1.start();
 
        t2.start();
 
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        //Checking states of both the threads
 
        System.out.println(t1.getState());     //Output : BLOCKED
 
        System.out.println(t2.getState());     //Output : BLOCKED
    }
}