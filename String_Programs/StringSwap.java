package com.lara2;

public class StringSwap 
{
	public static void main(String[] args)
	{
		String a = "hello";
		String b = "brother";
		System.out.println("Before Swaping : a =>"+a +", b=> "+b);
		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After swapping : a =>"+a +",  b=>"+b);
		
	}
}

/*Before Swaping : a =>hello, b=> brother
After swapping : a =>brother,  b=>hello
*/