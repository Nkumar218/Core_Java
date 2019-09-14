package com.lara7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDemo 
{
	public static List<Employee> getEmployee()
	{
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101, "Zaheer", "Khan", 45000));
		list.add(new Employee(109, "Kamal", "Singh", 15000));
		list.add(new Employee(102, "Popat", "Lal", 35000));
		list.add(new Employee(108, "Dhruva", "Singh", 55000));
		list.add(new Employee(103, "Sankaj", "Chaudhary", 95000));
		list.add(new Employee(107, "Rahul", "Bhagat", 75000));
		list.add(new Employee(104, "Niru", "Pandey", 85000));
		list.add(new Employee(106, "Ashok", "Dhawan", 45000));
		list.add(new Employee(105, "Bindu", "Powar", 25000));
		list.add(new Employee(110, "Vinayak", "Shailesh", 85000));
		return list;
	}
	public static void main(String[] args)
	{
		List<Employee> list = getEmployee();
		System.out.println("Ascending Order based on Id===================>");
		list.sort(Comparator.comparing(Employee :: getId));
		list.forEach(System.out :: println);
		System.out.println("Descending Order based on Id===================>");
		list.sort(Comparator.comparing(Employee :: getId).reversed());
		list.forEach(System.out :: println);
		
		System.out.println("Ascending Order based on firstName===================>");
		list.sort(Comparator.comparing(Employee :: getFirstName));
		list.forEach(System.out :: println);
		System.out.println("Descending Order based on firstName===================>");
		list.sort(Comparator.comparing(Employee :: getFirstName).reversed());
		list.forEach(System.out :: println);
		
		System.out.println("Ascending Order based on salary===================>");
		list.sort(Comparator.comparing(Employee :: getSalary));
		list.forEach(System.out :: println);
		System.out.println("Descending Order based on salary===================>");
		list.sort(Comparator.comparing(Employee :: getSalary).reversed());
		list.forEach(System.out :: println);
	}
}
