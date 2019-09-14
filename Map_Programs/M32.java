package com.lara.Map;

public class M32 
{
	public static void main(String[] args) 
	{
		String s1 = System.getProperty("test");
		System.out.println(s1);
		String s2 = System.getProperty("xyz");
		System.out.println(s2);
	}
}
/*
null
null

run as argument and go in VM arguments then write
-Dtest=123 -Dxyz=200
123
200

*/