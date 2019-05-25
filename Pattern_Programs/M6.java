package com.lara.Pattern;

public class M6 
{
	public static void main(String[] args)
	{
		for(int i = 4; i >= 0; i--)
		{
			for(int j = i; j> 0; j--)
			{
				System.out.print("*");
			}
			for(int j = i; j < 4; j++)
			{
				System.out.print(" ");
			}
			for(int j = i; j <= 4; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
