package com.lara.Array;

import java.util.Arrays;

public class A7 
{
	public static void main(String[] args) 
	{
		int [] x = {2, 5, 17, 5, 10, 20};
		System.out.println(Arrays.toString(x));
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] == first)
			{
				second = first;
			}
			else if(x[i] < first)
			{
				second = first;
				first = x[i];
			}
			else if(x[i] < second)
			{
				second = x[i];
			}
		}
		System.out.println("First:"+first);
		System.out.println("Second :"+second);
	}
}
