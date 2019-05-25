package com.lara.Array;

import java.util.Arrays;

public class SmallestElement 
{
	public static void main(String[] args)
	{
		int [] x = {10, 20, 30, 14, 24, 40};
		System.out.println(Arrays.toString(x));
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == smallest)
			{
				secondSmallest = smallest;
			}
			else if(x[i] < smallest)
			{
				secondSmallest = smallest;
				smallest = x[i];
			}
			else if(x[i] < secondSmallest)
			{
				secondSmallest = x[i];
			}
		}
		System.out.println("First Smallest :"+smallest);
		System.out.println("Second Smallest :"+secondSmallest);
	}
}
