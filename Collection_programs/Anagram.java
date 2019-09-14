package com.lara6;

import java.util.Arrays;

public class Anagram 
{
	public static void isAnagram(String s1, String s2)
	{
		String st1 = s1.replaceAll("\\s", "");
		String st2 = s2.replaceAll("\\s", "");
		boolean flag = true;
		if(s1.length() != s2.length())
		{
			flag = false;
		}
		else
		{
			char[] ch1 = st1.toLowerCase().toCharArray();
			char[] ch2 = st2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			flag = Arrays.equals(ch1, ch2);
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
		isAnagram("CAT", "ACT");
		isAnagram("hello to all", " allwelcome to");
	}
}
