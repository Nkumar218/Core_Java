package com.lara8;

public class StringMerge 
{
	public static void main(String[] args) 
	{
		String s1 = "niranjan";
		String s2 = "kumar";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for(int i = 0; i < c1.length+c2.length; i++)
		{
			for(int j = c2.length-1; j >= 0; j--)
			{
				System.out.println(s1.charAt(j));
			}
		}
	}
}
