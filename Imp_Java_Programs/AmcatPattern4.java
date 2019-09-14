package com.lara12;

import java.util.Scanner;

public class AmcatPattern4 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of column");
		int n = sc.nextInt();
		int rows = n, column = n;
		for(int i = 1; i<= rows; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i = 1; i <= rows; i++)
		{
			for(int j = column; j >= i; j--)
			{
				System.out.print(n);
			}
			n--;
			System.out.println();
		}
	}
}
