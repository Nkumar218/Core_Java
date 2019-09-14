package com.lara8;

import java.util.Scanner;

public class StringPalidrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new  Scanner(System.in); 
		System.out.println("Enter string");
		String original = sc.nextLine();
		String reverse ="";
		char[] c1 = original.toCharArray();
		int length = c1.length;
		for(int i = length-1; i >= 0; --i)
		{
			reverse += original.charAt(i);
		}
		if(reverse.equals(original))
		{
			System.out.println("Entered String is palidrome");
		}
		else
		{
			System.out.println("Entered String is not a palidrome");
		}
	}
}
/*
Enter string
kalak
Entered String is palidrome
*/