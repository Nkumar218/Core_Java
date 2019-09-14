package com.lara.Map;

import java.io.FileReader;
import java.util.Properties;

public class M34 
{
	public static void main(String[] args) throws Exception
	{
		Properties pr = new Properties();
		System.out.println(pr);
		pr.load(new FileReader("hello.properties"));
		String s1 = pr.getProperty("age");
		String s2 = pr.getProperty("your.name");
		System.out.println(s1);
		System.out.println(s2);
	}
}
/*
{}
22
vinay

all the properties are loaded in the object
key is String type
*/