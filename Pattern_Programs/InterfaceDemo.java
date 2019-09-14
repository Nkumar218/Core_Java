package com.lara.Pattern;
interface A
{
	final String s = null;
	static int k=0;
	int i = 0, j = 0;
	void test();
}
interface B
{
	void test();
}
public class InterfaceDemo implements A, B
{
	@Override
	public void test()
	{
		System.out.println("Impl");
	}
	int size = 20;
	public static void main(String[] args) 
	{
		A a1 = new InterfaceDemo();
		a1.test();
		System.out.println(a1.i);
		System.out.println(a1.s);
	}
}
