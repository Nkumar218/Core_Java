package com.lara.Pattern;

public class M5 
{
	public static void main(String[] args) 
	{
		int rows = 4;
		int cols = 2*rows;
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			for(int j= 1; j <= rows-i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= rows-i; j++)
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
