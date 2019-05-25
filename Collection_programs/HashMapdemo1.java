package com.lara7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapdemo1
{
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
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			String string = (String) it.next();
			System.out.println(string+": "+map.get(string));
		}
	}
}
