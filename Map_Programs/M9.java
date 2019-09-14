package com.lara.Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class M9 
{
	public static void main(String[] args) 
	{
		HashMap map= new HashMap();
		map.put("abc", "test");
		map.put("xyz", true);
		map.put("hello", 100);
		map.put('a', 50.50);
		System.out.println(map);
		Set set = map.keySet();
		Object value;
		for(Object key:set)
		{
			value = map.get(key);
			System.out.println(key+":"+value);
		}
	}
}
/*
{a=50.5, abc=test, xyz=true, hello=100}
a:50.5
abc:test
xyz:true
hello:100
*/
