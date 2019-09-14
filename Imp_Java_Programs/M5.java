package com.lara10;
class Hello3
{
	void test(String s1)
	{
		System.out.println("String");
	}
	void test(Object s1)
	{
		System.out.println("Object");
	}
}
public class M5 
{
	public static void main(String[] args) 
	{
		Hello3 h1 = new Hello3();
		h1.test(null);
		h1.test("hello");
		h1.test(h1);
	}
}
