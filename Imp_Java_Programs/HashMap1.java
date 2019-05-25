package com.lara12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap1 
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
		Set<String> set = map.keySet();
		Iterator it = set.iterator();
		while (it.hasNext())
		{
			String object = (String) it.next();
			System.out.println(object+":"+map.get(object));
		}
	}
}
