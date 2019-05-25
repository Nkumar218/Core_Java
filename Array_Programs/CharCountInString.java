package com.lara4;

import java.util.HashMap;
import java.util.Map;

public class CharCountInString 
{
	public static void charCount(String string)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray = string.toCharArray();
		
		for(char c : charArray)
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
		System.out.println("Input String is :"+string);
		System.out.println("Char count is :"+map);
	}
	public static void main(String[] args) 
	{
		charCount("hello to All");
	}
}
