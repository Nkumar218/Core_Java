package com.lara10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMaap 
{
	public static void elementCount(int [] x)
	{
		Map<Integer, Integer> map = new HashMap<>();
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
		System.out.println(map);
	}
	public static void main(String[] args) 
	{
		int [] x = {1,2,4,6,8,2,3,4,5,6,7,8,9,1,3,5,7,8,9};
		System.out.println(Arrays.toString(x));
		elementCount(x);
	}
}
