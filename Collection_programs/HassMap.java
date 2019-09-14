package com.lara6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HassMap 
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("key1", "kavita");
		map.put("key10", "nobita");
		map.put("key9", "kamal");
		map.put("key3", "dhamal");
		map.put("key8", "pankaj");
		map.put("key4", "suman");
		map.put("key7", "raman");
		map.put("key5", "aman");
		map.put("key2", "boman");
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
