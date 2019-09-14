package com.lara.Map;

import java.util.HashMap;
import java.util.TreeMap;

public class M15 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("hello", 1000);
		map.put("abc", 1001);
		map.put("xyz", 1002);
		map.put("rest", 1003);
		System.out.println(map);
		TreeMap map1 =  new TreeMap();//sorting based on the keys
		map1.putAll(map);
		System.out.println(map1);
	}
}
/*
{rest=1003, abc=1001, xyz=1002, hello=1000}
{abc=1001, hello=1000, rest=1003, xyz=1002}
*/