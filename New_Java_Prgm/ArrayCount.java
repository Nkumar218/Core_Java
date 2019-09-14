package com.lara4;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayCount
{
	static void elementCount(int array[])
	{
		HashMap<Integer, Integer> input = new HashMap<Integer, Integer>();
		for(int x : array)
		{
			if(input.containsKey(x))
			{
				input.put(x, input.get(x)+1);
			}
			else
			{
				input.put(x, 1);
			}
		}
		System.out.println("Input Array :"+Arrays.toString(array));
		System.out.println("Element Count :"+input);
	}
	public static void main(String[] args) 
	{
		int []x = {10, 13, 15, 10, 13, 15, 20, 24, 12};
		elementCount(x);
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
