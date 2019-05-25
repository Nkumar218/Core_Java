package com.lara.Array;

public class RecursiveString
{
	public void reverse(String str)
	{
		if(str == null || str.length() <= 1)
		{
			System.out.println(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	public static void main(String[] args)
	{
		RecursiveString r = new RecursiveString();
		String s1 = "hello";
		r.reverse(s1);
	}
}
