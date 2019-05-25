package com.lara2;

import java.util.Arrays;

public class Anagram
{
	static void isAnagram(String s1, String s2)
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
			char[] arra1 = st1.toLowerCase().toCharArray();
			char[] arra2 = st2.toLowerCase().toCharArray();
			Arrays.sort(arra1);
			Arrays.sort(arra2); 
			flag = Arrays.equals(arra1, arra2);
		}
		if(flag)
		{
			System.out.println(st1+"  and "+st2+" anagrams");
		}
		else
		{
			System.out.println(st1+" and "+st2+" not anagrams");
		}
	}
	public static void main(String[] args)
	{
		isAnagram("cat", "act");
		
		isAnagram("mother in Law", "Hitler in Law");
	}
}
