package com.lara9;

public class StringPalidrome
{
	public static void isPalidrome(String string)
	{
		char[] ch = string.toCharArray();
		String rev = "";
		for(int i = ch.length-1; i >= 0; i--)
		{
			rev += string.charAt(i);
		}
		if(rev.equalsIgnoreCase(string))
		{
			System.out.println("Entered String is Palidrome");
		}
		else
		{
			System.out.println("Entered String is not palidrome");
		}
	}
	public static void main(String[] args)
	{
		isPalidrome("MADAM");
		isPalidrome("Welcome");
	}
}
