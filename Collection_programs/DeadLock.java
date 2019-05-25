package com.lara5;

class MyThread
{
	public void method1()
	{ 
		synchronized (String.class) 
		{
			System.out.println("Aquired lock on String.class object"); 
			synchronized (Integer.class) 
			{ 
				System.out.println("Aquired lock on Integer.class object"); 
				}
			} 
		} /* * This method also requests same two lock but in exactly * Opposite order i.e. first Integer and then String. * This creates potential deadlock, if one thread holds String lock * and other holds Integer lock and they wait for each other, forever. */ 
	public void method2() 
	{ 
		synchronized (Integer.class) 
		{ 
			System.out.println("Aquired lock on Integer.class object"); 
			synchronized (String.class) 
			{ 
				System.out.println("Aquired lock on String.class object"); 
				} 
			} 
		}
}
class MyThread1 extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("MyThread1");
		synchronized (this) 
		{
			
			try
			{
				wait();
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
class MyThread2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("MyThread2");
		synchronized (this) 
		{
			notify();
		}
	}
}
public class DeadLock 
{
	public static void main(String[] args) 
	{
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}
}
