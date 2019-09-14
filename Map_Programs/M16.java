package com.lara.Map;

import java.util.HashMap;
import java.util.TreeMap;

public class M16 
{
	public static void main(String[] args) 
	{
		TreeMap map = new TreeMap();
		map.put("hello", 1000);
		map.put("abc", 1001);
		map.put("xyz", 1002);
		map.put("rest", 1003);
		System.out.println(map);
	}
}
/*
every entry getting sorted based on the key values
{abc=1001, hello=1000, rest=1003, xyz=1002}
*/