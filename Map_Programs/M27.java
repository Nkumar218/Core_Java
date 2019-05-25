package com.lara.Map;

import java.util.LinkedHashMap;

public class M27 
{
	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		map.put("hello", 1023);
		map.put("hello1", 1223);
		map.put("hello2", 1323);
		map.put("hello3", 1423);
		map.put("hello4", 1423);
		map.put("hello5", 1623);
		System.out.println(map);
	}
}
//{hello=1023, hello1=1223, hello2=1323, hello3=1423, hello4=1423, hello5=1623}
//order of addition is following
//linkedList structure internally