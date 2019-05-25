package com.lara.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayLists 
{
	public static List<Employee> getEmployees()
	{
		List<Employee> emp = new ArrayList<>();
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
		return emp;		
	}
	public static void main(String[] args) 
	{
		List<Employee> list = getEmployees();
		System.out.println("Ascending Order based on EmpId");
		list.sort(Comparator.comparing(Employee:: getEmpId));
		list.forEach(System.out:: println);
		System.out.println("Descending Order based on EmpId");
		list.sort(Comparator.comparing(Employee:: getEmpId).reversed());
		list.forEach(System.out:: println);
		
		System.out.println("Ascending Order based on Empname");
		list.sort(Comparator.comparing(Employee:: getEmpName));
		list.forEach(System.out:: println);
		System.out.println("Descending Order based on EmpName");
		list.sort(Comparator.comparing(Employee:: getEmpName).reversed());
		list.forEach(System.out:: println);
		
		System.out.println("Ascending Order based on EmpSalary");
		list.sort(Comparator.comparing(Employee:: getSalary));
		list.forEach(System.out:: println);
		System.out.println("Descending Order based on EmpSalary");
		list.sort(Comparator.comparing(Employee:: getSalary).reversed());
		list.forEach(System.out:: println);
	}
}
