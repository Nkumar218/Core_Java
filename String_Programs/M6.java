package com.lara2;

public class M6
{
	public static void main(String[] args) 
	{
		int x =10;
		System.out.println("main:" + x);
		test1();
	}

	public static void test1() 
	{
	//	System.out.println("test1:" + x);//compile time error due to x 
	}
}
