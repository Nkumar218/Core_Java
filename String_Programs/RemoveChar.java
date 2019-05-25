package com.lara2;

public class RemoveChar 
{
	public static String removeAtIndex(String s1, int i)
	{
		return s1.substring(0, i) + s1.substring(i+1);
	}
	public static void main(String[] args)
	{
		String s1 = "welcome";	
		System.out.println(removeAtIndex(s1, 3));
	}
}
