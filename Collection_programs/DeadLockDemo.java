package com.lara7;
class A
{
	void test1()
	{
		System.out.println("Test1 begin");
		synchronized(this)
		{
			try 
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		System.out.println("Test1 end");
	}
	void test2()
	{
		System.out.println("Test2 begin");
		synchronized(this)
		{
			notify();
		}
		System.out.println("Test2 end");
	}
}
class MyThread1 extends Thread
{
	A obj;
	public MyThread1(A obj)
	{
		this.obj= obj;
	}
	@Override
	public void run()
	{
		obj.test1();
	}
}
class MyThread2 extends Thread
{
	A obj;
	public MyThread2(A obj)
	{
		this.obj= obj;
	}
	@Override
	public void run()
	{
		obj.test1();
	}
}
public class DeadLockDemo 
{
	public static void main(String[] args)
	{
		A a1 = new A();
		MyThread1 t1 = new MyThread1(a1);
		MyThread2 t2 = new MyThread2(a1);
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
		System.out.println("After Sleep");
		a1.test2();
	}
}
























