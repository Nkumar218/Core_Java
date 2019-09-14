package com.app2;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar 
{
	static void remove(String s1)
	{
		char []c1 = s1.toCharArray();
		LinkedHashSet<Character> set1 = new LinkedHashSet<Character>();
		HashSet<Character> set = new HashSet<Character>();
		for(char c:c1)
		{
			set1.add(c);
		}
		System.out.print(set1);
	}
	public static void main(String[] args) {
		String s1 = "Welcome";
		remove(s1);
	}
}
