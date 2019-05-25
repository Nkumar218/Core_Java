package com.lara7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapDemo3 {
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
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(set);
		Collections.sort(list, new  Comparator<Map.Entry<String, String>>()
		{
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2)
			{
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		System.out.println(list);
		//Set<String> set1 = map.keySet();
		Iterator<Entry<String, String>> it = list.iterator();
		Entry<String, String> entry = null;
		while (it.hasNext())
		{
			/*Map.Entry<java.lang.String, java.lang.String>*/ 
			entry = (Map.Entry<String, String>) it.next();
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}













