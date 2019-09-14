package com.lara12;

import java.util.Scanner;

class AgeException extends Exception
{
	public AgeException(String s)
	{
		super(s);
	}
}
public class CustomException
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age");
		int age = sc.nextInt();
		if(age > 21)
		{
			System.out.println("Eligible for marraige");
		}
		else
		{
			try
			{
				throw new AgeException("not eligible for marraige");
			}
			catch (AgeException e) 
			{
				System.out.println(e.getMessage());
			}
		}
	}
}
