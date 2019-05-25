package com.lara6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraysList 
{
	static List<Person> getDetails()
	{
		List<Person> list = new ArrayList<Person>();
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
		return list;
	}
	public static void main(String[] args) 
	{
		List<Person> list = getDetails();
		list.sort(Comparator.comparing(Person:: getId));
		list.forEach(System.out:: println);
	}
}
