package com.lara.Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Test2 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(10);
		set.add(0);
		set.add(10);
		set.add(15);
		set.add(5);
		set.add(20);
		set.add(30);
		set.add(null);
		System.out.println(set);
		HashSet set1 = new HashSet();
		set1.add("abc");
		set1.add("hello");
		set1.add("java");
		System.out.println(set1);
		set1.addAll(set);
		System.out.println(set1);
		System.out.println(set1.contains("java"));
		System.out.println(set1.contains("test"));
		System.out.println(set1.isEmpty());
		System.out.println(set1.remove(null));
		System.out.println(set1);
		System.out.println(set1.size());
		System.out.println(set1.clone());
		System.out.println(set1.retainAll(set));
		System.out.println(set1);
		System.out.println(set);
		Iterator it = set1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+",");
		}
	}
}

//Randomly stored element
//avoiding duplicates
//null allowed
//objects as well as primitive data type can store

//linkedList
//HasMap