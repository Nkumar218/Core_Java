package com.lara.Map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Test3 
{
	public static void main(String[] args)
	{
		Hashtable h1 = new Hashtable();
		h1.put("abc", 101);
		h1.put("xyz", 103);
		h1.put("hello", 104);
		h1.put("java", 105);
		h1.put("test", 106);
		h1.put("all", 108);
		//h1.put(null, 101);//not allowed
		//h1.put("a", null);//not allowed
		System.out.println(h1);
		System.out.println(h1.containsKey("abc"));
		System.out.println(h1.replace(1, "hi", 500));
		System.out.println(h1);
		System.out.println("-------Iterator------------");
		Set s1 = h1.entrySet();
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
		System.out.println();
		TreeMap map = new TreeMap();
		map.put("ab1", 200);
		map.put("ab2", 204);
		map.put("ab3", 205);
		map.put("ab4", 201);
		System.out.println(map);
	}
}
