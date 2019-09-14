package com.lara8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringNonRepeatable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char c = repeativeChar(s1);
		System.out.println("first Non repeative char is:"+c);
	}
	public static Character repeativeChar(String string)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Character c;
		int length = string.length();
		for(int i = 0; i < length; i++)
		{
			c = string.charAt(i);
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		for(int i = 0; i < length; i++)
		{
			c = string.charAt(i);
			if(map.get(c)== 1)
				return c;
		}
		return null;
	}
}
