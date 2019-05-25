package com.lara12;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstRepeatedChar 
{
	static Character repeatedChar(String s1)
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		Character ch;
		for(int i = 0; i < s1.length(); i++)
		{
			ch = s1.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		for(int i = 0; i < s1.length(); i++)
		{
			ch = s1.charAt(i);
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
		String s = sc.nextLine();
		char ch1 = repeatedChar(s);
		System.out.println(ch1);
	}
}
