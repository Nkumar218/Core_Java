package com.lara.Map;

import java.util.Hashtable;
import java.util.TreeMap;

public class HashTable
{
	public static void main(String[] args)
	{
		Hashtable h1 = new Hashtable();
		h1.put("sid", "1");
		h1.put("sname", "sunil");
		h1.put("sage", "35");
		h1.put("aphone", "90876654");
		System.out.println(h1);
		TreeMap t1 = new TreeMap();
		t1.put("sid", "1");
		t1.put("sname", "sunil");
		t1.put("sage", "35");
		t1.put("aphone", null);
		System.out.println(t1);
	}
}
