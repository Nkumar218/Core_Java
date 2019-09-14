package com.lara7;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo
{
	public static void main(String[] args) 
	{
		Set<Employee> list = new TreeSet<>(Comparator.comparing(Employee:: getId));
		System.out.println("Ascending Order based on Id-------------------->");
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
		list.forEach(System.out:: println);
		
		System.out.println("Reverse Order based on the id----------------------->");
		Set<Employee> list1 = new TreeSet<>(Comparator.comparing(Employee:: getId).reversed());
		list1.add(new Employee(101, "Zaheer", "Khan", 45000));
		list1.add(new Employee(109, "Kamal", "Singh", 15000));
		list1.add(new Employee(102, "Popat", "Lal", 35000));
		list1.add(new Employee(108, "Dhruva", "Singh", 55000));
		list1.add(new Employee(103, "Sankaj", "Chaudhary", 95000));
		list1.add(new Employee(107, "Rahul", "Bhagat", 75000));
		list1.add(new Employee(104, "Niru", "Pandey", 85000));
		list1.add(new Employee(106, "Ashok", "Dhawan", 45000));
		list1.add(new Employee(105, "Bindu", "Powar", 25000));
		list1.add(new Employee(110, "Vinayak", "Shailesh", 85000));
		list1.forEach(System.out:: println);
		
		Set<Employee> list2 = new TreeSet<>(Comparator.comparing(Employee:: getSalary));
		System.out.println("Ascending Order based on salary-------------------->");
		list2.add(new Employee(101, "Zaheer", "Khan", 45000));
		list2.add(new Employee(109, "Kamal", "Singh", 15000));
		list2.add(new Employee(102, "Popat", "Lal", 35000));
		list2.add(new Employee(108, "Dhruva", "Singh", 55000));
		list2.add(new Employee(103, "Sankaj", "Chaudhary", 95000));
		list2.add(new Employee(107, "Rahul", "Bhagat", 75000));
		list2.add(new Employee(104, "Niru", "Pandey", 85000));
		list2.add(new Employee(106, "Ashok", "Dhawan", 45000));
		list2.add(new Employee(105, "Bindu", "Powar", 25000));
		list2.add(new Employee(110, "Vinayak", "Shailesh", 85000));
		list2.forEach(System.out:: println);
		
		System.out.println("Reverse Order based on the firstname----------------------->");
		Set<Employee> list11 = new TreeSet<>(Comparator.comparing(Employee:: getFirstName).reversed());
		list11.add(new Employee(101, "Zaheer", "Khan", 45000));
		list11.add(new Employee(109, "Kamal", "Singh", 15000));
		list11.add(new Employee(102, "Popat", "Lal", 35000));
		list11.add(new Employee(108, "Dhruva", "Singh", 55000));
		list11.add(new Employee(103, "Sankaj", "Chaudhary", 95000));
		list11.add(new Employee(107, "Rahul", "Bhagat", 75000));
		list11.add(new Employee(104, "Niru", "Pandey", 85000));
		list11.add(new Employee(106, "Ashok", "Dhawan", 45000));
		list11.add(new Employee(105, "Bindu", "Powar", 25000));
		list11.add(new Employee(110, "Vinayak", "Shailesh", 85000));
		list11.forEach(System.out:: println);
	}
}
