package com.lara7;

import java.util.*;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeDemo {
	public static void main(String[] args) 
	{
		Map<String, String> map = new ConcurrentHashMap();
		map.put("Hello1", "Mohan");
		map.put("Hi", "hari");
		map.put("welcome", "To Lara");
		map.put("Hello", "friends");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while (it.hasNext()) 
		{
			String string = (String) it.next();
			System.out.println(string+": "+map.get(string));
			map.put("add", "into List");
		}
	}
}
