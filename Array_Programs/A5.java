package com.lara.Array;

import java.util.Arrays;

public class A5 
{
	public static void order(int [] array, int num)
	{
		Arrays.sort(array);
		for(int i = 0; i < num/2; i++)
		{
			System.out.print(array[i]+", ");
		}
		for(int i = num - 1; i >= num/2; i--)
		{
			System.out.print(array[i]+", ");
		}
	}
	public static void main(String[] args)
	{
		int [] x = {10, 20, 30, 13, 23, 47, 50};
		int length = x.length;
		order(x, length);
	}
}
