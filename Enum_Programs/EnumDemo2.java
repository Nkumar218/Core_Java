package com.lara.Enum;

public class EnumDemo2 
{
	enum DEPARTMENT
	{
		ACCOUNT(10), HR(34), FINANCE(354), SECURITY(324);
		private int id;
		DEPARTMENT(int depId)
		{
			this.id = depId;
		}
		public int getId()
		{
			return id;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("A/C id:"+DEPARTMENT.ACCOUNT.getId());
		System.out.println("HR id:"+DEPARTMENT.HR.getId());
		System.out.println("Finance id:"+DEPARTMENT.FINANCE.getId());
		System.out.println("Security id:"+DEPARTMENT.SECURITY.getId());
	}
}
