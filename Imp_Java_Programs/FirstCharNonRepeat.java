package com.lara10;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FirstCharNonRepeat
{
	static Character nonRepeatedChar(String s)
	{
		char[] c = s.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < c.length; i++)
		{
			if(map.containsKey(c[i]))
			{
				map.put(c[i], map.get(c[i])+1);
			}
			else
			{
				map.put(c[i], 1);
			}
		}
		for(int i = 0; i < c.length; i++)
		{
			if(map.get(c[i])== 1)
			{
				return c[i];
			}
		}
		return null;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = sc.nextLine();
		char c1 = nonRepeatedChar(s1);
		System.out.println(c1);
	}
}
