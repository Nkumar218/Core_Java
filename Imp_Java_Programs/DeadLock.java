package com.lara12;
class B
{
	void test1()
	{
		System.out.println("test1 begin");
		synchronized(this)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("test1 end");
	}
	void test2()
	{
		System.out.println("test2 begin");
		synchronized (this)
		{
			notify();
		}
		System.out.println("test2 end");
	}
}
class MyThread1 extends Thread
{
	B b1;
	public MyThread1(B b1)
	{
		this.b1 = b1;
	}
	@Override
	public void run() 
	{
		b1.test1();
	}
}
class MyThread2 extends Thread
{
	B b1;
	public MyThread2(B b1)
	{
		this.b1 = b1;
	}
	@Override
	public void run() 
	{
		b1.test1();
	}
}
public class DeadLock
{
	public static void main(String[] args)
	{
		B b1 = new B();
		MyThread1 t1 = new MyThread1(b1);
		MyThread2 t2 = new MyThread2(b1);
		t1.start();
		t2.start();
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("After sleep");
		B b2 = new B();
		b2.test2();
	}
}























