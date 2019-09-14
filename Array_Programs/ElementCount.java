package com.lara.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class ElementCount 
{
	static void count(int [] x)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : x)
		{
			if(map.containsKey(i))
			{
				map.put(i, map.get(i)+1);
			}
			else
			{
				map.put(i, 1);
			}
		}
		System.out.println("Input Array :"+Arrays.toString(x));
		System.out.println("Element Count :"+map);
	}
	public static void main(String[] args)
	{
		int [] x = {1, 2, 4, 6, 8, 2, 4, 6, 8, 10, 20};
		count(x);
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
	}
}
