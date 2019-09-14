package com.lara10;
class Hello4
{
	void test(String s1)
	{
		System.out.println("String");
	}
	void test(Hello4 s1)
	{
		System.out.println("hello4");
	}
}
public class M6 
{
	public static void main(String[] args) 
	{
		Hello4 h1 = new Hello4();
		h1.test("hello");
		
		//h1.test(null);//ambiguous 
		h1.test(h1);
	}
}
