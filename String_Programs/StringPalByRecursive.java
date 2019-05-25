package com.lara8;

public class StringPalByRecursive 
{
	public static String isPalidrome(String string)
	{
		char[] ch1 = string.toCharArray();
		int length = ch1.length;
		String reverse ="";
		for(int i = length-1; i >= 0; i--)
		{
			reverse += string.charAt(i);
		}
		if(reverse.equals(string))
		{
			System.out.println("Entered String is palidrome");
		}
		else
		{
			System.out.println("Entered String is not a palidrome");
		}
		return "revesre";
	}
	public static void main(String[] args) 
	{
		isPalidrome("Hello");
		isPalidrome("MADAM");
	}
}
