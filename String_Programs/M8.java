package com.lara2;

public class M8 
{
	static int i =test1();
	static int j =test1();
	static int test1()
	{
		System.out.println("from test1:" +i +"," + j);
		return 10;
	}
	static
	{
		System.out.println("static block"+i);
	}
	
	{
		System.out.println("instance block"+i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(i);
		System.out.println(j);
		System.out.println("main end");
		M8 m = new M8();
	}
}
