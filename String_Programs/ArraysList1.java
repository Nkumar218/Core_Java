package com.lara8;


import java.util.*;
class Person
{
	private int id;
	private String name;
	private long phone;
	public Person(int id, String name, long phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if(!(obj instanceof Person))
		{
			return false;
		}
		Person p1 = (Person)obj;
		if(this.id == p1.getId())
		{
			return true;
		}
		return false;
	}
}
public class ArraysList1 
{
	public static void main(String[] args) 
	{
		System.out.println("================Ascending Order based on id==============");
		SortedSet<Person> p1 = new TreeSet<>(Comparator.comparing(Person:: getId));
		p1.add(new Person(101, "Kamal", 3876));
		p1.add(new Person(104, "Zaheer", 1876));
		p1.add(new Person(103, "Alok", 1876));
		p1.add(new Person(102, "Pukar", 4876));
		p1.forEach(System.out :: println);
		
		System.out.println("================Descending Order based on id==============");
		SortedSet<Person> p2 = new TreeSet<>(Comparator.comparing(Person:: getId).reversed());
		p2.add(new Person(101, "Kamal", 3876));
		p2.add(new Person(104, "Zaheer", 1876));
		p2.add(new Person(103, "Alok", 1876));
		p2.add(new Person(102, "Pukar", 4876));
		p2.forEach(System.out :: println);
		
		System.out.println("================Ascending Order based on id==============");
		SortedSet<Person> p3 = new TreeSet<>(Comparator.comparing(Person:: getName));
		p3.add(new Person(101, "Kamal", 3876));
		p3.add(new Person(104, "Zaheer", 1876));
		p3.add(new Person(103, "Alok", 1876));
		p3.add(new Person(102, "Pukar", 4876));
		p3.forEach(System.out :: println);
		
		System.out.println("================Descending Order based on id==============");
		SortedSet<Person> p4 = new TreeSet<>(Comparator.comparing(Person:: getName).reversed());
		p4.add(new Person(101, "Kamal", 3876));
		p4.add(new Person(104, "Zaheer", 1876));
		p4.add(new Person(103, "Alok", 1876));
		p4.add(new Person(102, "Pukar", 4876));
		p4.forEach(System.out :: println);
		
		System.out.println("================Ascending Order based on id==============");
		SortedSet<Person> p5 = new TreeSet<>(Comparator.comparing(Person:: getPhone));
		p5.add(new Person(101, "Kamal", 3876));
		p5.add(new Person(104, "Zaheer", 1876));
		p5.add(new Person(103, "Alok", 1876));
		p5.add(new Person(102, "Pukar", 4876));
		p5.forEach(System.out :: println);
		
		System.out.println("================Descending Order based on id==============");
		SortedSet<Person> p6 = new TreeSet<>(Comparator.comparing(Person:: getPhone).reversed());
		p6.add(new Person(101, "Kamal", 3876));
		p6.add(new Person(104, "Zaheer", 1876));
		p6.add(new Person(103, "Alok", 1876));
		p6.add(new Person(102, "Pukar", 4876));
		p6.forEach(System.out :: println);
	}
}






