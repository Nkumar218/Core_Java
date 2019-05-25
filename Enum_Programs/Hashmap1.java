package com.lara9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap1 
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
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String key = (String) it.next();
			System.out.println(key+":"+map.get(key));
		}
	}
}
