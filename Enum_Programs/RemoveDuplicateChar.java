package com.lara9;

import java.util.LinkedHashSet;

public class RemoveDuplicateChar 
{
	public static void duplicateChar(String string)
	{
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i < string.length(); i++)
		{
			set.add(string.charAt(i));
		}
		for(Character c : set)
		{
			System.out.print(c);
		}
	}
	public static void main(String[] args)
	{
		duplicateChar("hello");
	}
}
