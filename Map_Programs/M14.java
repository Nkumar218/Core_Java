package com.lara.Map;

import java.util.HashMap;
import java.util.TreeMap;
public class M14 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("hello", 1000);
		map.put("abc", 1001);
		map.put("xyz", 1002);
		map.put("rest", 1003);
		System.out.println(map);
		TreeMap map1 =  new TreeMap(map);
		System.out.println(map1);
	}
}
//{rest=1003, abc=1001, xyz=1002, hello=1000}
//{abc=1001, hello=1000, rest=1003, xyz=1002}
//based on keys sorted the elements
