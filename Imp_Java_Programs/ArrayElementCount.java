package com.lara12;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayElementCount
{
	public static void count(int [] x)
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
		System.out.println("Given Array :"+Arrays.toString(x));
		System.out.println(map);
	}
	public static void main(String[] args) {
		int [] x = {10, 20, 30, 10, 40, 20, 50};
		count(x);
		
	}
}
