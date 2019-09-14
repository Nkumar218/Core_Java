package com.lara8;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashDemo
{
	public static void main(String[] args)
	{
		Set<Employee> emp = new TreeSet<>(Comparator.comparing(Employee:: getName));
		emp.add(new Employee(101, "Komal", 94000));
		emp.add(new Employee(111, "Popat", 84000));
		emp.add(new Employee(108, "Jhetha", 64000));
		emp.add(new Employee(107, "Tarak", 50000));
		emp.add(new Employee(103, "Babita", 20000));
		emp.add(new Employee(102, "Anjali", 40000));
		emp.add(new Employee(105, "daya", 30000));
		emp.add(new Employee(109, "Goli", 14000));
		emp.add(new Employee(106, "Roshan", 33000));
		emp.add(new Employee(104, "Shikhar", 44000));
		emp.add(new Employee(112, "Naveen", 32000));
		emp.forEach(System.out:: println);
		System.out.println("=============Reverse Order");
		Set<Employee> emp1 = new TreeSet<>(Comparator.comparing(Employee:: getName).reversed());
		emp1.add(new Employee(101, "Komal", 94000));
		emp1.add(new Employee(111, "Popat", 84000));
		emp1.add(new Employee(108, "Jhetha", 64000));
		emp1.add(new Employee(107, "Tarak", 50000));
		emp1.add(new Employee(103, "Babita", 20000));
		emp1.add(new Employee(102, "Anjali", 40000));
		emp1.add(new Employee(105, "daya", 30000));
		emp1.add(new Employee(109, "Goli", 14000));
		emp1.add(new Employee(106, "Roshan", 33000));
		emp1.add(new Employee(104, "Shikhar", 44000));
		emp1.add(new Employee(112, "Naveen", 32000));
		emp1.forEach(System.out:: println);
	}
}
