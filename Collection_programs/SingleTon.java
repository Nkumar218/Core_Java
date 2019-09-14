package com.lara7;

public class SingleTon 
{
	static SingleTon singleton;
	private SingleTon()
	{
		//
	}
	public SingleTon getSingletin()
	{
		if(singleton == null)
		{
			singleton = new SingleTon();
		}
		return singleton;
	}
}
