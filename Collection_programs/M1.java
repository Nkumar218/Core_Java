package com.lara6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class M1
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "Ramesh");
		map.put("key3", "Lakhan");
		map.put("key2", "Karan");
		map.put("key4", "Puran");
		map.put("key6", "Suresh");
		Set<Entry<String, String>> set = map.entrySet();
		Entry<String, String> entry = null;
		for(Object obj : set)
		{
			entry = (Entry<String, String>)obj;
			System.out.println(entry.getKey()+":  "+entry.getValue());
		}
	}
}
