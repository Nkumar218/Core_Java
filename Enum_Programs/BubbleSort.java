package com.lara9;

import java.util.Arrays;

public class BubbleSort
{
	public static void main(String[] args) 
	{
		int [] x = {10, 2, 4, 20, 15, 6, 18};
		System.out.println(Arrays.toString(x));
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 1; j < x.length; j++)
			{
				if(x[j] < x[j-1])
				{
					int temp = x[j-1];
					x[j-1] = x[j];
					x[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
