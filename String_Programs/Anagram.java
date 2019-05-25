package com.lara.String;

import java.util.Arrays;

public class Anagram 
{
	public static void isAnagram(String s1, String s2)
	{
		String st1 = s1.replaceAll("\\s", "");
		String st2 = s2.replaceAll("\\s", "");
		boolean flag = true;
		if(st1.length() != st2.length())
		{
			flag = false;
		}
		else
		{
			char[] c1 = st1.toLowerCase().toCharArray();
			char[] c2 = st2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag = Arrays.equals(c1, c2);
		}
		if(flag)
		{
			System.out.println(st1+" and "+st2+" is Anagram");
		}
		else
		{
			System.out.println(st1+" and "+st2+" is not Anagram");
		}
	}
	public static void main(String[] args) 
	{
		isAnagram("DOG", "GOD");
		isAnagram("helloTo", "Welcome");
	}
}
