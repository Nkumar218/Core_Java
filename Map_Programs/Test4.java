package com.lara.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class Test4 
{
	public static void main(String[] args) 
	{
		HashMap h1 = new HashMap();
		h1.put("abc", 101);
		h1.put("xyz", 103);
		h1.put("hello", 104);
		h1.put("java", 105);
		h1.put("test", 106);
		h1.put("all", 108);
//		h1.put("alll", null);
//		h1.put(null, "hello");
		System.out.println(h1);
		System.out.println(h1.size());
		System.out.println("Using Key Set");
		Set s1 = h1.keySet();
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			String key = it.next().toString();
			String value = h1.get(key).toString();
			System.out.println(key+":"+value);
		}
		System.out.println("Using Entry Set");
		Set s2 = h1.entrySet();
		Iterator it1 = s2.iterator();
		while(it1.hasNext())
		{
			Map.Entry m1 = (Map.Entry) it1.next();
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
	}
}
/*
{all=108, abc=101, java=105, test=106, xyz=103, hello=104}
6
Using Key Set
all:108
abc:101
java:105
test:106
xyz:103
hello:104
Using Entry Set
all:108
abc:101
java:105
test:106
xyz:103
hello:104

*/