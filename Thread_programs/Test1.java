package com.lara.Thread;
class B implements Runnable
{
	@Override
	public void run()
	{
		for(int i  =0; i < 10; i++)
		{
			System.out.println(i);
		}
	}
}
public class Test1 
{
	public static void main(String[] args)
	{
		B b1 = new B();
		Thread t1 = new Thread(b1);
		t1.start();
	}
}
