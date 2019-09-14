package com.lara12;

public class EvenOdd 
{
	static Object obj = new Object();
	public static void main(String[] args) throws InterruptedException
	{
		Thread t1 = new Thread(new Runnable()
		{	
			@Override
			public void run() 
			{
				for(int i = 1; i <= 20; i +=2)
				{
					synchronized(obj)
					{
						System.out.print(i+", ");
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
				for(int i = 2; i <= 20; i +=2)
				{
					synchronized(obj)
					{
						System.out.print(i+", ");
						try
						{
							
							obj.notify();
							if(i== 20)
							{
								break;
							}
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
		t1.start();
		t2.start();
		t1.join();
		t2.join();
	}
}
