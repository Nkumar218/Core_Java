package com.lara.Pattern;

public class M7 
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5-i; j++)
			{
				System.out.print(1);
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
