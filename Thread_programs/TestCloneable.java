package com.lara.Thread;
class Employee implements Cloneable
{
	private int empId;
	private String empName;
	private Department department;
	public Employee(int empId, String empName, Department department) {
		//super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
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
public class TestCloneable 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Department d1 = new Department(1, "HR");
		Employee e1 = new Employee(101, "HiraLal", d1);
		Employee e2 = (Employee) e1.clone();
		System.out.println(e2.getDepartment().getId());
		System.out.println(e2.getDepartment().getName());
	}
}



















