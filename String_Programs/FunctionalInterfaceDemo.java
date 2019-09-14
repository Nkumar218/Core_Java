package com.lara8;

@FunctionalInterface
public interface FunctionalInterfaceDemo
{
	abstract void test1();
	default void test2()
	{
		//
	}
	static void test3()
	{
		//
	}
	@Override
	String toString();
	@Override
	boolean equals(Object obj);
	@Override
	int hashCode();
}
