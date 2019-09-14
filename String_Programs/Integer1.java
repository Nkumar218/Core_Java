package com.lara8;

import java.util.Arrays;
import java.util.Scanner;

public class Integer1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to Re-Arrange highest possible integer");
		String s1 = sc.nextLine();
		char[] c1  = s1.toCharArray();
		for(int i = 0; i < c1.length; i++)
		{
			for(int j = i +1 ; j <= c1.length-1; j++)
			{
				if(c1[i] < c1[j])
				{
					char temp = c1[j];
					c1[j] = c1[i];
					c1[i] = temp;
				}
			}
		}
		System.out.println(c1);
	}
}
/*
Enter number to Re-Arrange highest possible integer
1234567889
9887654321
*/