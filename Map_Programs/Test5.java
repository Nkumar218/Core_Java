package com.lara.Map;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Test5
{
	public static void main(String[] args)
	{
		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		set.add(60);
		set.add(50);
		set.add(80);
		set.add(70);
		System.out.println(set);
		LinkedHashSet set1 = new LinkedHashSet();
		set1.add("IND");
		set1.add("AUS");
		set1.add("NZ");
		set1.add("ENG");
		set1.add("BAN");
		set1.add("SA");
		System.out.println(set1);
		set1.addAll(set);
		System.out.println(set1);
		Iterator it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+",");
		}
	}
}
