package com.lara.Array;

import java.util.Arrays;

public class BubbleSort 
{
	public static void main(String[] args)
	{
		int [] array = {10, 24, 15, 20, 16, 40};
		System.out.println(Arrays.toString(array));
		for(int i = 0; i < array.length; i++)
		{
			for(int j = i+1; j < array.length; j++)
			{
				if(array[j] < array[i])
				{
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
