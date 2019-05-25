package com.lara6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "Ramesh");
		map.put("key3", "Lakhan");
		map.put("key2", "Karan");
		map.put("key4", "Puran");
		map.put("key6", "Suresh");
		Set<String> set = map.keySet();
		Iterator<String>  it = set.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println("Key:"+key+" Value :"+map.get(key));
		}
	}
}
