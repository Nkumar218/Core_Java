package com.array;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayCount {
	static void elementCount(int array[])
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int arr: array)
		{
			if(map.containsKey(arr))
			{
				map.put(arr, map.get(arr)+1);
			}
			else
			{
				map.put(arr, 1);
			}
		}
		System.out.println("Input Array :"+Arrays.toString(array));
		System.out.println("Element Count :"+map);
	}
	public static void main(String[] args) {
		int array[] = {1, 3, 5, 7, 9, 2, 4, 6, 8, 2, 4, 6, 7, 9, 10};
//		System.out.println(Arrays.toString(array));
//		System.out.println(array.length);
		elementCount(array);
	}
}
