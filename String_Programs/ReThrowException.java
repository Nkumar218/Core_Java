package com.lara8;

public class ReThrowException 
{
	public static void method()
	{
		System.out.println("from method Begin");
		try
		{
			ArithmeticException ex = new ArithmeticException("Hello exception");
			ex.initCause(new ClassNotFoundException("Exception Explicitely thrown"));
			throw ex; 
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
		System.out.println("from method end");
	}
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("from main Begin");
		try
		{
			System.out.println("inside try block");
			method();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
		System.out.println("from main end");
	}
}
