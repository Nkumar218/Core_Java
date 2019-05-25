package com.lara10;
class Hi
{
	static void test()
	{
		System.out.println("test()");
	}
}
public class M2
{
	public static void main(String[] args)
	{
		Hi h1 = new Hi();
		h1.test();
		Hi.test();
	}
}
