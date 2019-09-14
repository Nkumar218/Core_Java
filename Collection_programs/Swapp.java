package com.lara5;

import java.util.Arrays;

public class Swapp {
	public static void main(String[] args) 
	{
		int[] input ={1, 9, 2, 8, 5, 7, 3, 0, 6, 4};
		System.out.println(Arrays.toString(input));
		int temp;
		for(int i =1; i < input.length; i++)
		{
		
			for (int j = i; j > 0 ; j--)
			{
				if (input[j] < input[j -1])
				{
					temp = input[j];
					input[j] = input[j-1];
					input[j-1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(input));
	}
}
