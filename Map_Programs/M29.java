package com.lara.Map;

import java.util.Properties;
import java.util.Set;

public class M29 
{
	public static void main(String[] args) 
	{
		Properties pr = new Properties();
		pr.setProperty("abc", "value");//allowes only String as key and String as value
		pr.setProperty("abc1", "test");
		pr.setProperty("abc2", "hello");
		pr.setProperty("to", "all");
		Set set = pr.keySet();
		for(Object key : set)
		{
			System.out.println(key+":"+pr.getProperty((String)key));
		}
	}
}
/*
abc2:hello
abc1:test
abc:value
to:all

properties also coming under map
*/