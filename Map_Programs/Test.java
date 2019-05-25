package com.lara.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Test 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
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
		System.out.println();
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}


//ArrayList
//linkedList
//HasMap
//Vector
//HashSet