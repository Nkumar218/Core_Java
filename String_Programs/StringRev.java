package com.lara8;

import java.util.Scanner;

public class StringRev 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char[] c1 = s1.toCharArray();
		int size = c1.length;
		for(int i = size-1; i >=0; i--)
		{
			System.out.print(c1[i]);
		}
	}
}
