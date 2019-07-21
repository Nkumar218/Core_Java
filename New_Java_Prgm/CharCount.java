package com.app2;

import java.util.HashMap;

public class CharCount
{
	static void count(String s1)
	{
		char [] c1 = s1.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(char c : c1)
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
	public static void main(String[] args) {
		String s1 = "Programming";
		count(s1);
	}
}
