package com.lara.String;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstRepeatedChar
{
	static Character repeatedChar(String s1)
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		Character ch1;
		for(int i = 0; i < s1.length(); i++)
		{
			ch1 = s1.charAt(i);
			if(map.containsKey(ch1))
			{
				map.put(ch1, map.get(ch1)+1);
			}
			else
			{
				map.put(ch1, 1);
			}
		}
		for(int i = 0; i < s1.length(); i++)
		{
			ch1 = s1.charAt(i);
			if(map.get(ch1) == 1)
			{
				return ch1;
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char ch1 = repeatedChar(s1);
		System.out.println(ch1);
	}
}
