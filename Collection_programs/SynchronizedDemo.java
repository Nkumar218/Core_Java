package com.lara7;
class Displays
{
	public synchronized void wish(String name)
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.print("good Morning :");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
class MyThread extends Thread
{
	Displays d;
	String name;
	public MyThread(Displays d, String name) 
	{
		this.d = d;
		this.name = name;
	}
	@Override
	public void run()
	{
		d.wish(name);
	}
}
public class SynchronizedDemo
{
	public static void main(String[] args)
	{
		Displays d1 = new Displays();
		MyThread t1 = new MyThread(d1, "Dhoni");
		MyThread t2 = new MyThread(d1, "Yuvi");
		t1.start();
		t2.start();
	}
}





















