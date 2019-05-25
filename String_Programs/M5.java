package com.lara2;

public class M5 
{
	public static void main(String[] args) 
	{
		int x=20;
		System.out.println("main1:" + x);//20
		x =30;//scope of the x is within the main method
		test1();
		System.out.println("main2:" + x);//30
	}
	public static void test1() 
	{
		int x=100;
		System.out.println("test1:" + x);//100
		x =100;//Scope of x is within the test1()
	}
}
