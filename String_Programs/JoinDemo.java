package com.lara2;

public class JoinDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "welcome TO Software World";
		String string = String.join("-", "Welcome", "to", "hello World");
		System.out.println(string);
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String[] split = s1.split("\\s");
		for(String splits : split)
		{
			System.out.println(splits);
		}
	}
}
