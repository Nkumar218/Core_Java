package com.lara9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap2 
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();
		map.put("key1", "Komal");
		map.put("key8", "Daya");
		map.put("key2", "Anjali");
		map.put("key4", "Babita");
		map.put("key3", "Shodhi");
		map.put("key5", "Pallavi");
		map.put("key6", "Chitu");
		map.put("key7", "Ema");
		Set<Map.Entry<String, String>> set = map.entrySet();
		for(Entry entry : set)
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
}
