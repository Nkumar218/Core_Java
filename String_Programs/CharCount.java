package com.lara.String;

import java.util.HashMap;
import java.util.Scanner;

public class CharCount 
{
	static void  charCount(String s)
	{
		char[] ch = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c : ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		charCount(s1);
	}
}
