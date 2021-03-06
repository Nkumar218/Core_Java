package com.lara12;

public class Employee
{
	private int empId;
	private String name;
	private Integer salaries;
	public Employee(int empId, String name, Integer salaries) {
		super();
		this.empId = empId;
		this.name = name;
		this.salaries = salaries;
	}
	@Override
	public String toString() {
		return "(" + empId + ", " + name + ", " + salaries + ")";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalaries() {
		return salaries;
	}
	public void setSalaries(Integer salaries) {
		this.salaries = salaries;
	}
}
