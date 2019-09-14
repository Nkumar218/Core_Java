package com.lara.Array;

import java.util.Arrays;

public class SortWave 
{
	static void swap(int [] x, int a, int b)
	{
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}
	static void sortA(int [] x, int num)
	{
		Arrays.sort(x);
		for(int i = 0; i < num-1; i +=2)
		{
			swap(x, i, i+1);
		}
	}
	public static void main(String[] args) 
	{
		int [] x = {2, 20, 8, 10, 4, 30, 6, 40};
		int length = x.length;
		sortA(x, length);
		for(int i = 0; i < length; i++)
		{
			System.out.print(x[i]+",");
		}
	}
}
