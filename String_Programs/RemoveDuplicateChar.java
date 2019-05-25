package com.lara2;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar 
{
	public static void removeChar(String s)
	{
		LinkedHashSet<Character> duplicate = new LinkedHashSet<Character>();
		for(int i = 0; i < s.length(); i++)
		{
			duplicate.add(s.charAt(i));
		}
		for(Character ch : duplicate)
		{
			System.out.print(ch);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String st = sc.nextLine();
		removeChar(st);
	}
}
