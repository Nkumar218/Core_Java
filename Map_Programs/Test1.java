package com.lara.Map;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test1
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		System.out.println(v1.capacity());
		v1.add(10);
		v1.add(13);
		v1.add(1);
		v1.add(0);
		v1.add(16);
		v1.add(18);
		v1.add("abc");
		v1.add("xyz");
		v1.add("hello");
		v1.add("test");
		v1.add("abc");
		System.out.println(v1);
		Iterator it = v1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()+",");
		}
		System.out.println("---Enumerator using----");
		Enumeration e1 = v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.print(e1.nextElement()+",");
		}
		System.out.println();
		System.out.println("ListIterator started");
		System.out.println("Forword order");
		ListIterator list = v1.listIterator();
		while(list.hasNext())
		{
			System.out.print(list.next()+",");
		}
		System.out.println("Reverse order");
		ListIterator list1 = v1.listIterator();
		while(list1.hasPrevious())
		{
			System.out.print(list1.previous());
		}
	}
}


//ArrayList
//linkedList
//HasMap
//Vector
//HashSet