package com.lara.Map;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(12);
		list.add(21);
		list.add(23);
		list.add(14);
		list.add(10);
		list.add(5);
		list.add(8);
		System.out.println(list);
		System.out.println(list.size());
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+",");
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
