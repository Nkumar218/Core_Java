package com.lara4;

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
	void test1()
	{
		System.out.println("test1 begin");
		synchronized(this)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println("tset1 end");
		}
	}
	void test2()
	{
		System.out.println("test2 begin");
		synchronized (this) 
		{
			notifyAll();
		}
		System.out.println("test2 end");
	}
}
/*
test1 begin
test1 begin
After sleep
test2 begin
test2 end
*/
class Thread1 extends Thread
{
	A obj;
	public Thread1(A obj) 
	{
		this.obj = obj;
	}
	@Override
	public void run()
	{
		obj.test1();
	}
}
class Thread2 extends Thread
{
	A obj;
	public Thread2(A obj) 
	{
		this.obj = obj;
	}
	@Override
	public void run()
	{
		obj.test1();
	}
}
public class DeadStateTread
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		Thread1 t1 = new Thread1(a1);
		Thread2 t2 = new Thread2(a1);
		t1.start();
		t2.start();
		Util.sleep(10000);
		System.out.println("After sleep");
		a2.test2();
	}
}