package com.lara8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo 
{
	public static List<Employee> getEmployee()
	{
		List<Employee> emp = new ArrayList<>();
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
		return emp;
	}
	public static void main(String[] args)
	{
		List<Employee> list = getEmployee();
		System.out.println("=====Ascending Order based on EmpId===========");
		list.sort(Comparator.comparing(Employee :: getEmpId));
		list.forEach(System.out:: println);
		System.out.println("=====Descending Order based on EmpId===========");
		list.sort(Comparator.comparing(Employee :: getEmpId).reversed());
		list.forEach(System.out:: println);
		System.out.println("=====Ascending Order based on Name===========");
		list.sort(Comparator.comparing(Employee :: getName));
		list.forEach(System.out:: println);
		System.out.println("=====Descending Order based on Name===========");
		list.sort(Comparator.comparing(Employee :: getName).reversed());
		list.forEach(System.out:: println);
		System.out.println("=====Ascending Order based on Salaries===========");
		list.sort(Comparator.comparing(Employee :: getSalaries));
		list.forEach(System.out:: println);
		System.out.println("=====Descending Order based on Salaries===========");
		list.sort(Comparator.comparing(Employee :: getSalaries).reversed());
		list.forEach(System.out:: println);
	}
}





























