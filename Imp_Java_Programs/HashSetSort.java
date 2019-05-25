package com.lara12;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetSort 
{
	public static void main(String[] args)
	{
		Set<Employee> emp = new TreeSet<>(Comparator.comparing(Employee:: getEmpId));
		System.out.println("Ascending order based on the id");
		emp.add(new Employee(101, "mohan", 45000));
		emp.add(new Employee(109, "sohan", 15000));
		emp.add(new Employee(105, "kohan", 25000));
		emp.add(new Employee(102, "rohan", 95000));
		emp.add(new Employee(104, "ganesh", 85000));
		emp.add(new Employee(103, "baala", 65000));
		emp.add(new Employee(108, "ankita", 55000));
		emp.add(new Employee(106, "gopal", 35000));
		emp.add(new Employee(107, "dk", 75000));
		emp.forEach(System.out:: println);
		System.out.println("Descending order based on the id");
		Set<Employee> emp1 = new TreeSet<>(Comparator.comparing(Employee:: getEmpId).reversed());
		emp1.add(new Employee(101, "mohan", 45000));
		emp1.add(new Employee(109, "sohan", 15000));
		emp1.add(new Employee(105, "kohan", 25000));
		emp1.add(new Employee(102, "rohan", 95000));
		emp1.add(new Employee(104, "ganesh", 85000));
		emp1.add(new Employee(103, "baala", 65000));
		emp.add(new Employee(108, "ankita", 55000));
		emp1.add(new Employee(106, "gopal", 35000));
		emp1.add(new Employee(107, "dk", 75000));
		emp1.forEach(System.out:: println);
		Set<Employee> emp2 = new TreeSet<>(Comparator.comparing(Employee:: getName));
		System.out.println("Ascending order based on the name");
		emp2.add(new Employee(101, "mohan", 45000));
		emp2.add(new Employee(109, "sohan", 15000));
		emp2.add(new Employee(105, "kohan", 25000));
		emp2.add(new Employee(102, "rohan", 95000));
		emp2.add(new Employee(104, "ganesh", 85000));
		emp2.add(new Employee(103, "baala", 65000));
		emp2.add(new Employee(108, "ankita", 55000));
		emp2.add(new Employee(106, "gopal", 35000));
		emp2.add(new Employee(107, "dk", 75000));
		emp2.forEach(System.out:: println);
		System.out.println("Descending order based on the salary");
		Set<Employee> emp3 = new TreeSet<>(Comparator.comparing(Employee:: getSalaries).reversed());
		emp3.add(new Employee(101, "mohan", 45000));
		emp3.add(new Employee(109, "sohan", 15000));
		emp3.add(new Employee(105, "kohan", 25000));
		emp3.add(new Employee(102, "rohan", 95000));
		emp3.add(new Employee(104, "ganesh", 85000));
		emp3.add(new Employee(103, "baala", 65000));
		emp3.add(new Employee(108, "ankita", 55000));
		emp3.add(new Employee(106, "gopal", 35000));
		emp3.add(new Employee(107, "dk", 75000));
		emp3.forEach(System.out:: println);
	}
}
