package com.lara.Map;

import java.util.HashMap;
import java.util.Set;

public class M7 
{
	public static void main(String[] args) 
	{
		HashMap map= new HashMap();
		map.put("abc", "test");
		map.put("xyz", true);
		map.put("hello", 100);
		map.put('a', 50.50);
		System.out.println(map);
		Set set = map.entrySet();
		for(Object obj: set)
		{
			System.out.println(obj);
		}
	}
}
/*
{a=50.5, abc=test, xyz=true, hello=100}
a=50.5
abc=test
xyz=true
hello=100
*/
