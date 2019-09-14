package com.lara8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapdemo1 
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
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext())
		{
			String key = (String)it.next();
			System.out.println(key+" :"+map.get(key));
		}
	}
}
