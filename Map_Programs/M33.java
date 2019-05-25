package com.lara.Map;

import java.io.FileReader;
import java.util.Properties;

public class M33 
{
	public static void main(String[] args) throws Exception
	{
		Properties pr = new Properties();
		System.out.println(pr);
		pr.load(new FileReader("hello.properties"));
		System.out.println(pr);
	}
}
/*
{}
{your.name=vinay, age=22, country.name=Great India, good.weight=79}

all the properties are loaded in the object
key is String type
*/