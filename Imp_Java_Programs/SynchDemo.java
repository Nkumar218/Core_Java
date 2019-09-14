package com.lara10;
class MyThread extends Thread
{
	int total = 0;
	@Override
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Start calculation");
			for(int i = 1; i <= 100; i++)
			{
				total = total+1;
			}
			System.out.println("Giving Notification");
			this.notify();
		}
	}
}
public class SynchDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread t1 = new MyThread();
		t1.start();
		synchronized (t1)
		{
			System.out.println("synchronized call wait()");
			t1.wait();
			System.out.println("main thread got notification");
			System.out.println(t1.total);
		}
	}
}
