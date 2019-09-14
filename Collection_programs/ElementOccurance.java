package com.lara7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ElementOccurance
{
	public static void main(String[] args)
	{
		int [] x = { 1,4,5,2,3,5,1,6,4,7,1,3,6,8,2,5};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < x.length; i++)
		{
			int key = x[i];
			if(map.containsKey(key))
			{
				int count = map.get(key);
				count++;
				map.put(key, count);
			}
			else
			{
				map.put(key, 1);
			}
		}
		for(Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+" Occurs :"+entry.getValue());
		}
	}
}
