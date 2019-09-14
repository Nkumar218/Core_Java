package com.lara.Map;

import java.util.Properties;

public class M28 
{
	public static void main(String[] args) 
	{
		Properties pr = new Properties();
		pr.setProperty("abc", "value");//allowes only String as key and String as value
		pr.setProperty("abc1", "test");
		pr.setProperty("abc2", "hello");
		pr.setProperty("to", "all");
		System.out.println(pr.getProperty("to"));
		System.out.println(pr.getProperty("abc"));
		System.out.println(pr.getProperty("abc2"));
		System.out.println(pr.getProperty("abc1"));
		System.out.println(pr.getProperty("xyz"));//if keys not available shows as a null
	}
}
/*
all
value
hello
test
null

properties also coming under map
*/