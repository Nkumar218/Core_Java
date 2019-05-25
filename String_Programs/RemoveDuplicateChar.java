package com.lara.String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar 
{
	static void removeChar(String s)
	{
		char[] ch1 = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(char i = 0; i < ch1.length; i++)
		{
			set.add(ch1[i]);
		}
		for(Character c : set)
		{
			System.out.print(c);
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		removeChar(s1);
	}
}
