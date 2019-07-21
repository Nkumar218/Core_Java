package com.app2;

public class SingleTon 
{
	private static SingleTon singleTon;
	
	private SingleTon()
	{
		//
	}
	public static SingleTon getSingleTon()
	{
		if(singleTon == null)
		{
			singleTon = new SingleTon();
		}
		return singleTon;
	}
	void test()
	{
		System.out.println("from SingleTon class");
	}
}
