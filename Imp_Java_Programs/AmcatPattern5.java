package com.lara12;

import java.util.Scanner;

public class AmcatPattern5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j<= rows; j++)
			{
				if(j == 1)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(i+1);
				}
			}
			System.out.println();
		}
	}
}
