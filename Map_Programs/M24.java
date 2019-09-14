package com.lara.Map;

import java.util.Hashtable;

public class M24 
{
	public static void main(String[] args) 
	{
		Hashtable tab = new Hashtable();
		tab.put("abc", 2000);
		tab.put("abc1", 4000);
		tab.put("abc2", 6000);
		tab.put("abc3", 8000);
		tab.put("ab4", 9000);
		tab.put("abc5", 5000);
		System.out.println(tab);	
	}
}
/*
{abc5=5000, abc3=8000, abc2=6000, abc1=4000, abc=2000, ab4=9000}
Hashtable : no indexing
very similar to HashMap
Hashtable not allowing null value
*/