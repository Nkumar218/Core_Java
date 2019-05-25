package com.lara8;
import java.util.*;
import java.util.Map.Entry;

public class HasshMap
{
	public static void main(String[] args)
	{
		Map<String, String> map = new TreeMap<>(Collections.reverseOrder());
		map.put("Name1", "Atul");
		map.put("Name2", "Kumar");
		map.put("Name3", "Pankaj");
		map.put("Name4", "Rahul");
		map.put("Name5", "Naman");
		map.put("Name6", "Gunjan");
		System.out.println(map);
		Set set = map.entrySet();
		Entry entry = null;		
		for(Object obj : set)
		{
			entry = (Entry)obj;
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}
}
