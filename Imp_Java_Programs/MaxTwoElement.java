package com.lara12;

import java.util.Arrays;

public class MaxTwoElement
{
	public static void main(String[] args) 
	{
		int [] x = {10, 24, 15, 20, 16, 40};
		System.out.println(Arrays.toString(x));
		int maxOne = x[0];
		int maxTwo = x[0];
		for(int i = 0; i < x.length; i++)
		{
			if(x[i] > maxOne)
			{
				maxTwo = maxOne;
				maxOne = x[i];
			}
			else if(x[i] > maxTwo)
			{
				maxTwo = x[i];
			}
		}
		System.out.println("First Max Element :"+maxOne);
		System.out.println("Second Max Element :"+maxTwo);
	}
}
