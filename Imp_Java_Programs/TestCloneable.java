package com.lara12;
class Department
{
	private int id;
	private String name;
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
class Employee1 implements Cloneable
{
	private int empId;
	private String empName;
	private Department department;
	public Employee1(int empId, String empName, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
}
public class TestCloneable
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Department d1 = new Department(101, "HR");
		Employee1 e1 = new Employee1(1001, "Rohan", d1);
		Employee1 e2 = (Employee1) e1.clone();
		System.out.println(e2.getDepartment().getId());
		System.out.println(e2.getDepartment().getName());
	}
}
