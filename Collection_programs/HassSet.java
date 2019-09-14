package com.lara6;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HassSet 
{
	public static void main(String[] args)
	{
		Set<Person> list = new TreeSet<>(Comparator.comparing(Person:: getName).reversed());
		list.add(new Person(101, "Koyal"));
		list.add(new Person(109, "Payal"));
		list.add(new Person(107, "Ghayal"));
		list.add(new Person(108, "Soyal"));
		list.add(new Person(103, "Madan"));
		list.add(new Person(102, "Ashok"));
		list.add(new Person(104, "Bimal"));
		list.add(new Person(103, "Lova"));
		list.add(new Person(105, "Sunil"));
		list.add(new Person(110, "Rakul"));
		list.forEach(System.out:: println);
	}
}
