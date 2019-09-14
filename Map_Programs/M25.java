package com.lara.Map;

import java.util.Hashtable;

public class M25 {
	public static void main(String[] args) 
	{
		Hashtable tab = new Hashtable();
		tab.put("abc", 2000);
		tab.put("abc1", 4000);
		tab.put("abc2", 6000);
		tab.put("abc3", null);
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
Hashtable not allowing null value but HashMap allowing null values
*/