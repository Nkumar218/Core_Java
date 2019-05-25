package com.lara.Map;

import java.util.TreeMap;

public class M17 
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
		map.put("hello", 1000);
		map.put("abc", 1001);
		map.put(1000, 1002);
		map.put("rest", 1003);
		System.out.println(map);
	}
}
/*
every entry getting sorted based on the key values
compiler allowed any type of keys
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
	at java.lang.Integer.compareTo(Unknown Source)
	at java.util.TreeMap.put(Unknown Source)
	at com.lara.Map.M17.main(M17.java:12)

*/