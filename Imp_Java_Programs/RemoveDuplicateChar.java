package com.lara12;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateChar  
{
	static Character remove(String s1)
	{
		char[] ch1 = s1.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i = 0; i < ch1.length; i++)
		{
			set.add(ch1[i]);
		}
		for(char c1 : set)
		{
			System.out.print(c1);
		}
	 	return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		remove(s1);
	}
}
