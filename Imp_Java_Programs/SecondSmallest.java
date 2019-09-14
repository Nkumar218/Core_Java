package com.lara12;

import java.util.Arrays;

public class SecondSmallest 
{
	public static void main(String[] args)
	{
		int [] x = {10, 20, 24, 14, 26, 30};
		System.out.println(Arrays.toString(x));
		int smallest =Integer.MAX_VALUE;
		int secondSmall = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == smallest)
			{
				secondSmall = smallest;
			}
			else if(x[i] < smallest)
			{
				secondSmall = smallest;
				smallest = x[i];
			}
			else if(x[i]< secondSmall)
			{
				secondSmall = x[i];
			}
		}
		System.out.println("First Smallest element :"+smallest);
		System.out.println("Second Smallest element :"+secondSmall);
	}
}
