package com.lara12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort 
{
	public static List<Employee> getEmployees()
	{
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(101, "mohan", 45000));
		emp.add(new Employee(109, "sohan", 15000));
		emp.add(new Employee(105, "kohan", 25000));
		emp.add(new Employee(102, "rohan", 95000));
		emp.add(new Employee(104, "ganesh", 85000));
		emp.add(new Employee(103, "baala", 65000));
		emp.add(new Employee(108, "ankita", 55000));
		emp.add(new Employee(106, "gopal", 35000));
		emp.add(new Employee(107, "dk", 75000));
		return emp;
	}
	public static void main(String[] args) 
	{
		List<Employee> list = getEmployees();
		System.out.println("Ascending order based on the id");
		list.sort(Comparator.comparing(Employee:: getEmpId));
		list.forEach(System.out:: println);
		System.out.println("Descending order based on the id");
		list.sort(Comparator.comparing(Employee:: getEmpId).reversed());
		list.forEach(System.out:: println);
		System.out.println("Ascending order based on the name");
		list.sort(Comparator.comparing(Employee:: getName));
		list.forEach(System.out:: println);
		System.out.println("Descending order based on the name");
		list.sort(Comparator.comparing(Employee:: getName).reversed());
		list.forEach(System.out:: println);
		System.out.println("Ascending order based on the salary");
		list.sort(Comparator.comparing(Employee:: getSalaries));
		list.forEach(System.out:: println);
		System.out.println("Descending order based on the salary");
		list.sort(Comparator.comparing(Employee:: getSalaries).reversed());
		list.forEach(System.out:: println);
	}
}
