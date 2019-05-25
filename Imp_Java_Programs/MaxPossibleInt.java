package com.lara12;

import java.util.Scanner;

public class MaxPossibleInt
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer");
		String num = sc.nextLine();
		char[] c1 = num.toCharArray();
		for(int i = 0; i < c1.length; i++)
		{
			for(int j = i+1; j < c1.length; j++)
			{
				if(c1[i] < c1[j])
				{
					char temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
		}
		System.out.println(c1);
	}
}
