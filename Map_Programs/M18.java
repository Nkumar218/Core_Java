package com.lara.Map;

import java.util.TreeMap;

public class M18 {
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
		map.put("hello", 1000);
		map.put("abc", 1001);
		map.put(null, 1002);
		map.put("rest", 1003);
		System.out.println(map);
	}
}
/*
every entry getting sorted based on the key values
compiler allowed any type of keys
Exception in thread "main" java.lang.NullPointerException
	at java.util.TreeMap.put(Unknown Source)
	at com.lara.Map.M18.main(M18.java:11)

*/