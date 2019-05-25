package com.lara10;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount
{
	static void charCount(String s1)
	{
		char[] ch = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(Character c : ch)
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
		charCount("welcome");
	}
}
