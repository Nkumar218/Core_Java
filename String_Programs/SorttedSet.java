package com.lara8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SorttedSet 
{
	public static void main(String[] args)
	{
		Set<Employee> set = new TreeSet<>(Comparator.comparing(Employee:: getEmpId));
		System.out.println("===================================Ascending Order");
		set.add(new Employee(101, "palak", 987766));
		set.add(new Employee(109, "boman", 187766));
		set.add(new Employee(108, "suman", 787766));
		set.add(new Employee(103, "anand", 587766));
		set.add(new Employee(107, "raman", 487766));
		set.add(new Employee(106, "kamal", 287766));
		set.add(new Employee(104, "lalan", 387766));
		set.forEach(System.out :: println);
		Set<Employee> set1 = new TreeSet<>(Comparator.comparing(Employee:: getEmpId).reversed());
		System.out.println("===================================Descending Order");
		set1.add(new Employee(101, "palak", 987766));
		set1.add(new Employee(109, "boman", 187766));
		set1.add(new Employee(108, "suman", 787766));
		set1.add(new Employee(103, "anand", 587766));
		set1.add(new Employee(107, "raman", 487766));
		set1.add(new Employee(106, "kamal", 287766));
		set1.add(new Employee(104, "lalan", 387766));
		set1.forEach(System.out :: println);
	}
}
