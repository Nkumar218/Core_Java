
package com.lara.Map;

import java.util.Hashtable;

public class M26 
{
	public static void main(String[] args) 
	{
		Hashtable tab = new Hashtable();
		tab.put("abc", 2000);
		tab.put("abc1", 4000);
		tab.put(null, 6000);
		tab.put("abc3", 6475);
		tab.put("ab4", 9000);
		tab.put("abc5", 5000);
		System.out.println(tab);	
	}
}
/*
Exception in thread "main" java.lang.NullPointerException
	at java.util.Hashtable.put(Unknown Source)
	at com.lara.Map.M25.main(M25.java:12)

Hashtable : no indexing
very similar to HashMap
Hashtable not allowing null as a key and null as a value but HashMap allowing null values
hastable is synchronizable but hashmap is non-synchronizable
multiple threads not perform in hashMap
*/