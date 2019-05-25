package com.lara2;

public class M1 
{
	static int i;
	public static void main(String[] args)
	{
		System.out.println("main1:" + i);
		i =5;
		test1();
		System.out.println("main2:" +i);
		i =10;
		test2();
		System.out.println("main3:" +i);
	}
	public static void test1() 
	{
		System.out.println("test1: " + i);
		i =20;
	}
	public static void test2()
	{
		System.out.println("main2:" + i);
	}
}
