package com.lara.Enum;

import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String s1)
	{
		super(s1);
	}
}
class CheckAge
{
	public void verify(int age) throws AgeException
	{
		if(age > 0)
		{
			System.err.println("valid age");
		}
		else
		{
			throw new AgeException("Invalid Age");
		}
	}
}
public class UserException 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try
		{
			CheckAge c1 = new CheckAge();
			c1.verify(age);
		}
		catch(AgeException e)
		{
			System.err.println("Age must be Positive");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
