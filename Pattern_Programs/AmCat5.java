package com.lara.Pattern;

import java.util.Scanner;

public class AmCat5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows");
		int num = sc.nextInt();
		int i, j, cols= num, rows = num;
		for(i = 1; i <= rows; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		for(i = 1; i <= rows; i++)
		{
			for(j = cols; j >= i; j--)
			{
				System.out.print(num);
			}
			num--;
			System.out.println();
		}
	}
}
/*
Enter rows
5
1
22
333
4444
55555
55555
4444
333
22
1
*/