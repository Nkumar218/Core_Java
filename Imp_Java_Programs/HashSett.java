package com.lara10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSett 
{
	public static void main(String[] args)
	{
		Set<Number> set = new TreeSet<>();
		set.add(new Double(11));
		set.add(new Double(30));
		set.add(new Integer(25));
		set.add(new Double(11));
		set.add(new Double(40));
		set.add(new Integer(30));
		System.out.println(set.size());
		Iterator<Number> it = set.iterator();
		while (it.hasNext())
		{
			Integer value = (Integer) it.next();
			if(value == 3)
			{
				set.remove(value);
			}
			System.out.print(value+",");
		}
	}
}
