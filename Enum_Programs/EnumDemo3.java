package com.lara9;

public class EnumDemo3 
{
	enum DEPARTMENT
	{
		HR(10), ACCOUNT(20), MANAGER(30);
		private int id;
		private DEPARTMENT(int id)
		{
			this.id = id;
		}
		public int getId()
		{
			return id;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("HR infor :"+DEPARTMENT.HR.getId());
		System.out.println("ACCOUNT infor :"+DEPARTMENT.ACCOUNT.getId());
		System.out.println("Manager infor :"+DEPARTMENT.MANAGER.getId());
	}
}
