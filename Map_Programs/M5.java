package com.lara.Map;

import java.util.HashMap;

public class M5 {

	public static void main(String[] args)
	{
		HashMap map = new HashMap();
		map.put(null, 1000);
		System.out.println(map);
		map.put(null, 5000);
		System.out.println(map);
		map.put("null1", 1000);
		System.out.println(map);
	}

}
//any no of nulls are duplicated as key
/*
{null=1000}
{null=5000}
{null=5000, null1=1000}
*/