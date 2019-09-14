package com.lara8;

import java.util.Arrays;
public class RemoveDuplicate
{
	public static void main(String[] args) 
	{
		int [] x = {10, 2, 30, 15, 20, 4, 25, 10, 2, 30};
		System.out.println(Arrays.toString(x));
		int length = x.length;
		for(int i = 0; i < length; i++)
		{
			for(int j = i + 1; j < length; j++)
			{
				if(x[i] == x[j])
				{
					for(int k = j; k < length-1; k++)
					{
						x[k] = x[k+1];
					}
					j--;
					length--;
				}
			}
		}
		System.out.println(Arrays.toString(x));
		int [] y = new int[length];
		for(int i = 0; i < length; i++)
		{
			y[i] = x[i];
		}
		System.out.println(Arrays.toString(y));
	}
}
