package com.lara7;

import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String s) 
	{
		super(s);
	}
}
class CheckAge
{
	public void verify(int age) throws AgeException
	{
		if(age >= 18)
		{
			System.out.println("eligible for voting");
		}
		else
		{
			throw new AgeException("not Eligible for voting");
		}
	}
}
public class CustomException 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter age");
		int age = sc.nextInt();
		try
		{
			CheckAge check = new CheckAge();
			check.verify(age);
		}
		catch(AgeException e)
		{
			System.out.println("Age must be positive");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
