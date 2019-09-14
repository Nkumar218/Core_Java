package com.lara.Map;

import java.util.HashMap;

public class M2 
{
	public static void main(String[] args)
	{
		HashMap map1 = new HashMap();
		map1.put("abc",10000);
		map1.put("abc", 3000);
		System.out.println(1+":"+map1);
		map1.put("abc", 5000);
		System.out.println(2+":"+map1);
	}
}
/*
1:{abc=10000}
2:{abc=5000}
key avoiding the duplicates 
keys always should be unique
*/