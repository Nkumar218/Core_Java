package com.lara.Thread;

public class M1
{
	static Object obj = new Object();
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Runnable() 
		{			
			@Override
			public void run() 
			{
				for(int i = 1; i <= 20; i += 2)
				{
					synchronized (obj) 
					{
						System.out.print(i+" ");
						try
						{
							obj.notify();
							obj.wait();
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() 
		{			
			@Override
			public void run() 
			{
				for(int i = 2; i <= 20; i += 2)
				{
					synchronized (obj) 
					{
						System.out.print(i+" ");
						try
						{
							obj.notify();
							if(i == 20)
								break;
							obj.wait();
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		});
		try 
		{
			t1.start();
			t2.start();
			t1.join();
			t2.join();
		} catch (InterruptedException e)
		{
			e.printStackTrace();// TODO: handle exception
		}
	}
}
