package com.lara.Map;

import java.util.HashMap;

public class M1 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc", 1000);
		map.put("hello", 2000);
		map.put("key3", "test");
		map.put(100, true);
		System.out.println(map);
		System.out.println(map.get("abc"));
	}
}
/*
{abc=1000, 100=true, key3=test, hello=2000}

key mapping
no indexing, first argument is key and the second argument is the element
using put(); under two argument, in put method first argument is object type and 2nd object is also object type
Random order but every key is assigning the value
under may key value
*/