package com.lara.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> t1 = new HashMap<>();
		t1.put("abc", 101);
		t1.put("abc1", 102);
		t1.put("abc2", 103);
		t1.put("ab3", 104);
		t1.put("abc4", 101);
		t1.put("abc5", 101);
		t1.put("null", 20);
		System.out.println(t1);
		System.out.println(t1);
		Set<String> s1 = t1.keySet();
		Iterator<String> it = s1.iterator();
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

