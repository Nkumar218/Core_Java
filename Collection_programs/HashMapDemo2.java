package com.lara7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo2 
{
	public static void main(String[] args) 
	{
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "Niru");
		map.put("job", "software");
		map.put("ghar", "Shivpur");
		map.put("degree", "B.Tech");
		map.put("Dist", "Khagaria");
		map.put("State", "Bikhar");
		map.put("country", "India");
		System.out.println(map);
		Set<Map.Entry<String, String>> set = map.entrySet();
		for(Entry entry : set)
		{
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
