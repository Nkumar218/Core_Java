package com.app2;

public class Reverse 
{
	String rev = "";
	public String reverse(String s)
	{
		if(s.length()==0)
		{
			return s;
		}
		else
		{
			rev += s.charAt(s.length()-1)
					+reverse(s.substring(0, s.length()-1));
			return rev;
		}
		
	}
	public static void main(String[] args) {
		Reverse r = new Reverse();
		
		String st = "hello";
		System.out.println(r.reverse(st));;
	}
}
