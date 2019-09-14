package com.lara.Array;

import java.util.Arrays;

public class TopTwoElement 
{
	public static void main(String[] args) 
	{
		int [] x = {10, 24, 15, 20, 16, 40};
		System.out.println(Arrays.toString(x));
		int topOne = 0;
		int topTwo = 0;
		for(int i = 0; i < x.length; i++)
		{
			if(topOne < x[i])
			{
				topTwo = topOne;
				topOne = x[i];
			}
			else if(topTwo < x[i])
			{
				topTwo = x[i];
			}
		}
		System.out.println("Top one:"+topOne);
		System.out.println("Top second:"+topTwo);
	}
}
