package com.lara7;

import java.util.Scanner;

public class Test1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		//double d1 = sc.nextDouble();
		
		
		for(int i = 1; i <= num; i++)
		{
			int fact = 1;
			for(int j = 1; j <= i; j++)
			{
				fact = fact* i;
			}
			System.out.print(fact+", ");
		}
//		System.out.println();
	}
}
