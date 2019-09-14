package com.lara9;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		String c = reverse(s1);
		System.out.println(c);
	}
	static String reverse(String string)
	{
		char [] ch = string.toCharArray();
		String rev="";
		for(int i = ch.length-1; i >= 0; i--)
		{
			rev += string.charAt(i);
		}
		return rev;
	}
}
