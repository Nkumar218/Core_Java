package com.lara.Map;

import java.util.HashMap;

public class M4 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put("abc", 1000);
		map.put("abc1", 1000);
		map.put("abc2", 1000);
		map.put("abc3", 1000);
		map.put("abc4", 1000);
		map.put("abc5", 1000);
		map.put("abc6", 1000);
		map.put("abc7", 1000);
		System.out.println(map);		
	}
}
/*
{abc1=1000, abc=1000, abc7=1000, abc6=1000, abc3=1000, abc2=1000, abc5=1000, abc4=1000}
keys are unique but value can be same 
 */

