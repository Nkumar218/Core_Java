package com.lara.Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class M8 
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
		Entry entry = null;
		for(Object obj : set)
		{
			entry = (Entry)obj;
			System.out.println(entry.getKey()+" :"+entry.getValue());
		}
	}
}
/*
{a=50.5, abc=test, xyz=true, hello=100}
Key:a:Values:50.5
Key:abc:Values:test
Key:xyz:Values:true
Key:hello:Values:100

*/
