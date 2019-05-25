package com.lara12;

import java.util.Arrays;

public class CopyArray 
{
	public static void main(String[] args) 
	{
		int x[] = {10, 20, 30, 40, 50};
		int y[] = new int[x.length];
		for(int i = 0; i < x.length; i++)
		{
			y[i] = x[i];
		}
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}
}
