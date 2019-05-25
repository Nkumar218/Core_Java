package com.lara8;

public class ReThrowExce1 
{
	public static void main(String[] args) 
	{
		try
		{
			ArithmeticException c1 = new ArithmeticException("Execption Object");
			c1.initCause(new NullPointerException("this is the cause of exception"));
			throw c1;
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
	}
}
