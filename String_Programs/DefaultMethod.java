package com.lara8;

import java.util.Optional;

public interface DefaultMethod 
{
	public abstract void test1();
	abstract void test2();
	abstract void test3();//final/ protected can't be used/ synchronized keyword also not used.
	default void test4()
	{
		//
	}
	public default void test5()// Can not be used private, protected and find keyword with default method
	{
		//
	}
	static void test6() // Can not be used private, protected and find keyword with static method
	{
		//
	}
	@Override
	String toString();
	@Override
	boolean equals(Object obj);
	@Override
	int hashCode();
	Object clone() throws CloneNotSupportedException;
	
}
