package com.lara.Map;

import java.util.HashMap;

public class M3 
{
	public static void main(String[] args)
	{
		HashMap map1 = new HashMap();
		System.out.println(map1.put("abc",10000));
		System.out.println(1+":"+map1);
		System.out.println(map1.put("abc", 5000));
		System.out.println(2+":"+map1);
	}
}
/*
null
1:{abc=10000}
10000
2:{abc=5000}
replacing the existing value, if no exist any value return the null
*/