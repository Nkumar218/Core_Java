package com.lara9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapSort 
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
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String,String>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, String>>()
		{
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) 
			{
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		list.forEach(System.out:: println);
	}
}
