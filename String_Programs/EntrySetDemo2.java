package com.lara8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class EntrySetDemo2 
{
	public static void main(String[] args) 
	{
		Map<String, String> map = new HashMap<>();
		map.put("KEY1", "AMAN");
		map.put("KEY8", "BOMAN");
		map.put("KEY2", "KIRAN");
		map.put("KEY7", "SUNITA");
		map.put("KEY3", "GODDI");
		map.put("KEY6", "JETHA");
		map.put("KEY4", "POPAT");
		map.put("KEY5", "TARAK");
		Set<Entry<String, String>> set = map.entrySet();
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String,String>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, String>>()
		{
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2)
			{
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		list.forEach(System.out::println);
	}
}
