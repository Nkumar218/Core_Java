package com.lara8;

import java.util.*;

public class ConvertArrayListToArray 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("10");
		list.add("20");
		list.add("30");
		list.add("hello");
		list.add("test");
		list.add("java");
		System.out.println(list);
		
		String[] array = list.toArray(new String[list.size()]);
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+", ");
		}
	}
}
