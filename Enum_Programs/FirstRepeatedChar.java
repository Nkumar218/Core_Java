package com.lara9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstRepeatedChar 
{
	public static Character repeativeChar(String string)
	{
		Map<Character, Integer> map = new HashMap<>();
		Character ch;
		for(int i = 0; i < string.length(); i++)
		{
			ch = string.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		for(int i = 0; i < string.length(); i++)
		{
			ch = string.charAt(i);
			if(map.get(ch)== 1)
			{
				return ch;
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char c = repeativeChar(s1);
		System.out.println(c);
	}
}












