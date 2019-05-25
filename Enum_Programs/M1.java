package com.lara.Enum;

abstract class A
{
	static void test1()
	{
		System.out.println("hello A");
	}
	final void test2()
	{
		System.out.println("hello private A");
	}
	abstract void test3();
	final static void test()
	{
		System.out.println("hello final");
	}
}
public class M1 extends A
{
	@Override
	void test3()
	{
		System.out.println("hello Override from A class");
	}
	public static void main(String[] args) 
	{
		M1 m1 = new M1();
		m1.test2();
		m1.test3();
		m1.test1();
		test();
	}
}
