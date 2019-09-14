package com.lara.Thread;

import java.util.Arrays;

public class Array1 
{
	public static void main(String[] args) 
	{
		int[] x = {2, 4, 7, 9, 10, 25, 40};
		System.out.println(Arrays.toString(x));
		int max = 0;
		int avg = 0; int sum = 0;
		for(int i = 0; i < x.length; i++)
		{
			sum += x[i];
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		System.out.println("max :"+max);
		System.out.println("Sum:"+sum);
		avg = sum/x.length;
		System.out.println("Avg :"+avg);
	}
}
