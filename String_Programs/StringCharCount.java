package com.lara8;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount 
{
		public static void charCount(String st1)
		{
			Map<Character, Integer> map= new HashMap<>();
			char[] c1 = st1.toCharArray();
			for(char c2 : c1)
			{
				if(map.containsKey(c2))
				{
					map.put(c2, map.get(c2)+1);
				}
				else
				{
					map.put(c2, 1);
				}
			}
			System.out.println("Input string is :"+st1);
			System.out.println("Char count is :"+map);
		}
		public static void main(String[] args)
		{
			charCount("hello");
		}
}
