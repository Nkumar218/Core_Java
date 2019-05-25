package com.lara.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 
{
	public static void main(String[] args) 
	{
		TreeMap t1 = new TreeMap();
		t1.put("abc", 101);
		t1.put("abc1", 102);
		t1.put("abc2", 103);
		t1.put("ab3", 104);
		t1.put("abc4", 101);
		t1.put("abc5", 101);
		t1.put("hello", "xyz");
		t1.put("null", 20.98);
		System.out.println(t1);
		System.out.println(t1.pollFirstEntry());
		System.out.println(t1);
		System.out.println(t1.pollLastEntry());
		System.out.println(t1);
		Set s1 = t1.keySet();
		Iterator it = s1.iterator();
		while(it.hasNext())
		{
			String key = it.next().toString();
			String value = t1.get(key).toString();
			System.out.println(key+":"+value);
		}
		System.out.println("-----Using EntrySet-----------");
		Set s2 = t1.entrySet();
		Iterator it1 = s2.iterator();
		while(it.hasNext())
		{
			Map.Entry m1 = (Map.Entry) it1.next();
			System.out.println("key-"+m1.getKey()+": value-"+m1.getValue());
		}
	}
}

//commented portion is not executed
/*
{ab3=104, abc=101, abc1=102, abc2=103, abc4=101, abc5=101, hello=xyz, null=20.98}
ab3=104
{abc=101, abc1=102, abc2=103, abc4=101, abc5=101, hello=xyz, null=20.98}
null=20.98
{abc=101, abc1=102, abc2=103, abc4=101, abc5=101, hello=xyz}
abc:101
abc1:102
abc2:103
abc4:101
abc5:101
hello:xyz

*/