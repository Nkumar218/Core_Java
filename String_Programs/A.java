package com.lara.String;

public class A 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String st1 ="Nikhil";
		String st2 = "nikhil";
		String str3 = new String("NIkhil");
		System.out.println(st1==st2);
		System.out.println(st1 ==str3);
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(str3));
	}
}