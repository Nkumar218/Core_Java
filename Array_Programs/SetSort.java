package com.lara.Array;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSort 
{
	public static void main(String[] args) 
	{
		Set<Employee> emp = new TreeSet(Comparator.comparing(Employee:: getEmpId));
		emp.add(new Employee(101, "RAM", 54000));
		emp.add(new Employee(109, "SITA", 14000));
		emp.add(new Employee(102, "RAMESH", 24000));
		emp.add(new Employee(103, "KUNDAN", 57000));
		emp.add(new Employee(108, "KOMAL", 60000));
		emp.add(new Employee(107, "RITA", 30000));
		emp.add(new Employee(106, "GOLU", 35000));
		emp.add(new Employee(105, "DINA", 36000));
		emp.add(new Employee(104, "DIVAKAR", 45000));
		emp.add(new Employee(110, "KEDAR", 87000));
		emp.add(new Employee(111, "BALRAM", 90000));
		emp.forEach(System.out:: println);
		System.out.println("Based on salary reversed");
		Set<Employee> emp1 = new TreeSet(Comparator.comparing(Employee:: getSalary).reversed());
		emp1.add(new Employee(101, "RAM", 54000));
		emp1.add(new Employee(109, "SITA", 14000));
		emp1.add(new Employee(102, "RAMESH", 24000));
		emp1.add(new Employee(103, "KUNDAN", 57000));
		emp1.add(new Employee(108, "KOMAL", 60000));
		emp1.add(new Employee(107, "RITA", 30000));
		emp1.add(new Employee(106, "GOLU", 35000));
		emp1.add(new Employee(105, "DINA", 36000));
		emp1.add(new Employee(104, "DIVAKAR", 45000));
		emp1.add(new Employee(110, "KEDAR", 87000));
		emp1.add(new Employee(111, "BALRAM", 90000));
		emp1.forEach(System.out:: println);
	}
}
