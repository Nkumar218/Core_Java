package com.lara12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapSort 
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
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String,String>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String,String>>()
		{
			@Override
			public int compare(Entry<String, String> e1, Entry<String, String> e2) 
			{
				// TODO Auto-generated method stub
				return e1.getValue().compareTo(e2.getValue());
			}
		});
		list.forEach(System.out:: println);
	}
}
