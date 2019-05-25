package com.lara.String;

import java.util.Scanner;

public class StringPalidrome 
{
	static String isPalidrome(String s)
	{
		String rev = "";
		for(int i = s.length()-1; i >= 0; i--)
		{
			rev += s.charAt(i); 
		}
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Entered String is Palidrome");
		}
		else
		{
			System.out.println("Entered String is not palidrome");
		}
		return s;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		isPalidrome(s1);
		//isPalidrome("hello");
		
	}
}
