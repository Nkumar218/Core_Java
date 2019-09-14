package com.lara9;

public class EnumDemo 
{
	enum COLOR
	{
		RED, GREEN, YELLOW, BLACK
	}
	public static void main(String[] args)
	{
		for(Enum e : COLOR.values())
		{
			System.out.println(e);
		}
	}
}
