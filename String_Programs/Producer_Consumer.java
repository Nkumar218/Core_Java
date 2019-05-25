package com.lara2;

class Util
{
	static void sleep(long millis)
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
	}
}
class A
{
	
}
class Consumer implements Runnable
{
	A obj;
	public Consumer(A obj) 
	{
		this.obj = obj;
	}
	public void run() 
	{
		System.out.println("Thread1 begin");
		synchronized (obj)
		{
			try
			{
				obj.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Thread1 end");
	}
}
class Producer implements Runnable
{
	A obj;
	public Producer(A obj)
	{
		this.obj = obj;
	}
	public void run() 
	{
		System.out.println("Thread1 begin");
		synchronized (obj)
		{
			try
			{
				obj.wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Thread1 end");
	}
}
public class Producer_Consumer 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		Consumer c1 = new Consumer(a1);
		Producer c2 = new Producer(a2);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		Util.sleep(1000);
		System.out.println("After sleep");
		synchronized(a1)
		{
			a1.notifyAll();
		}
	}
}
