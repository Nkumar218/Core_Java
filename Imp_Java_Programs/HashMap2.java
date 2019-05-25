package com.lara12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMap2 
{
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "101");
		map.put("key3", "104");
		map.put("key2", "103");
		map.put("key5", "106");
		map.put("key4", "105");
		map.put("key7", "109");
		map.put("key6", "108");
		map.put("key8", "107");
		Set<Map.Entry<String, String>> set = map.entrySet();
		for(Entry entry : set)
		{
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
