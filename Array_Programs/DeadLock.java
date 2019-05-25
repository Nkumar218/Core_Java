package com.lara.Array;
class A
{
	void test1()
	{
		System.out.println("test1 begin");
		synchronized (this)
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
	A a1;
	public MyThread1(A a1) 
	{
		this.a1 = a1;// TODO Auto-generated constructor stub
	}
	@Override
	public void run()
	{
		a1.test1();
	}
}
class MyThread2 extends Thread
{
	A a1;
	public MyThread2(A a1) 
	{
		this.a1 = a1;// TODO Auto-generated constructor stub
	}
	@Override
	public void run()
	{
		a1.test1();
	}
}
public class DeadLock 
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a1.test1();
		a1.test2();
	}
}























