package com.lara10;

import java.util.Arrays;

public class SearchDuplicates
{
	public static void main(String[] args) 
	{
		int [] x = {10, 20, 30, 10, 40, 40};
		System.out.println(Arrays.toString(x));
		for(int i = 0; i < x.length; i++)
		{
			for(int j = i+1; j < x.length; j++)
			{
				if(x[j] == x[i])
				{
					System.out.println(x[i]+",");
				}
			}
		}
	}
}
